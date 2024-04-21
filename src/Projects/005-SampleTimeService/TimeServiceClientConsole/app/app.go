/*
Sınıf Çalışması: Uygulamada bir menu oluşturarak seçeneğe göre diğer end point'lere erişiniz.
Server'a gönderilecek parametre değerlerini de stdin'den alacak şekle getiriniz
*/
package app

import (
	"fmt"
	"io"
	"net/http"
	"os"
	"time"
)

func checkArguments() {
	if len(os.Args) != 2 {
		fmt.Printf("Wrong number of arguments!...")
		os.Exit(1)
	}
}

func timeClient(name, server string) (int, string) {
	req, err := http.NewRequest("GET", server+"/time?name="+name, nil)
	if err != nil {
		fmt.Printf("Error in request:%s", err.Error())
		return http.StatusInternalServerError, ""
	}

	client := http.Client{Timeout: 20 * time.Second}
	res, err := client.Do(req)

	if err != nil {
		fmt.Printf("Client error:%s", err.Error())
		return http.StatusInternalServerError, ""
	}

	defer res.Body.Close()

	if res.StatusCode != http.StatusOK {
		return res.StatusCode, ""
	}

	data, err := io.ReadAll(res.Body)

	if err != nil {
		fmt.Printf("Data error:%s", err.Error())
		return http.StatusInternalServerError, ""
	}

	return res.StatusCode, string(data)
}

func Run() {
	checkArguments()
	server := os.Args[1]
	fmt.Printf("Server:%s\n", server)
	status, message := timeClient("Deniz", server)

	if status == http.StatusOK {
		fmt.Println(message)
	} else {
		fmt.Printf("Status Code:%d\n", status)
	}
}
