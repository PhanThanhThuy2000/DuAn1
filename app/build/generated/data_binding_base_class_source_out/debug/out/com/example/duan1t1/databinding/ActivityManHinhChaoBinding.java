// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.duan1t1.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityManHinhChaoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout main;

  private ActivityManHinhChaoBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout main) {
    this.rootView = rootView;
    this.main = main;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityManHinhChaoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityManHinhChaoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_man_hinh_chao, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityManHinhChaoBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    LinearLayout main = (LinearLayout) rootView;

    return new ActivityManHinhChaoBinding((LinearLayout) rootView, main);
  }
}
