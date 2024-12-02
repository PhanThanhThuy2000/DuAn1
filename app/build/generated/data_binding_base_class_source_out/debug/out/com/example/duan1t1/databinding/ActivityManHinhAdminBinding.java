// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duan1t1.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityManHinhAdminBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final BottomNavigationView bnvAdmin;

  @NonNull
  public final FragmentContainerView fcvAdmin;

  @NonNull
  public final Toolbar toolbarAdmin;

  private ActivityManHinhAdminBinding(@NonNull LinearLayout rootView,
      @NonNull BottomNavigationView bnvAdmin, @NonNull FragmentContainerView fcvAdmin,
      @NonNull Toolbar toolbarAdmin) {
    this.rootView = rootView;
    this.bnvAdmin = bnvAdmin;
    this.fcvAdmin = fcvAdmin;
    this.toolbarAdmin = toolbarAdmin;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityManHinhAdminBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityManHinhAdminBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_man_hinh_admin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityManHinhAdminBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bnv_Admin;
      BottomNavigationView bnvAdmin = ViewBindings.findChildViewById(rootView, id);
      if (bnvAdmin == null) {
        break missingId;
      }

      id = R.id.fcv_Admin;
      FragmentContainerView fcvAdmin = ViewBindings.findChildViewById(rootView, id);
      if (fcvAdmin == null) {
        break missingId;
      }

      id = R.id.toolbar_admin;
      Toolbar toolbarAdmin = ViewBindings.findChildViewById(rootView, id);
      if (toolbarAdmin == null) {
        break missingId;
      }

      return new ActivityManHinhAdminBinding((LinearLayout) rootView, bnvAdmin, fcvAdmin,
          toolbarAdmin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}