package entity

import "github.com/jinzhu/gorm"

type TimeClientInfo struct {
	gorm.Model
	Host     string
	Name     string
	DateTime string
}
