// Generated by data binding compiler. Do not edit!
package org.csystem.android.app.generator.random.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.csystem.android.app.generator.random.R;
import org.csystem.android.app.generator.random.viewmodel.data.GenerateInfo;
import org.csystem.android.app.generator.random.viewmodel.data.ServerInfo;
import org.csystem.android.app.generator.random.viewmodel.listener.MainActivityListenerViewModel;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @Bindable
  protected MainActivityListenerViewModel mViewModel;

  @Bindable
  protected GenerateInfo mGenerateInfo;

  @Bindable
  protected ServerInfo mServerInfo;

  @Bindable
  protected ArrayAdapter<String> mAdapter;

  @Bindable
  protected boolean mEnabled;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable MainActivityListenerViewModel viewModel);

  @Nullable
  public MainActivityListenerViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setGenerateInfo(@Nullable GenerateInfo generateInfo);

  @Nullable
  public GenerateInfo getGenerateInfo() {
    return mGenerateInfo;
  }

  public abstract void setServerInfo(@Nullable ServerInfo serverInfo);

  @Nullable
  public ServerInfo getServerInfo() {
    return mServerInfo;
  }

  public abstract void setAdapter(@Nullable ArrayAdapter<String> adapter);

  @Nullable
  public ArrayAdapter<String> getAdapter() {
    return mAdapter;
  }

  public abstract void setEnabled(boolean enabled);

  public boolean getEnabled() {
    return mEnabled;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
