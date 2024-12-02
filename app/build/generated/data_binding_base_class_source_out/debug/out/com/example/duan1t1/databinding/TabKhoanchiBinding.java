// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duan1t1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TabKhoanchiBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView rcvListKhoanchi;

  @NonNull
  public final TextView tvTonggiaKhoanchi;

  private TabKhoanchiBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView rcvListKhoanchi,
      @NonNull TextView tvTonggiaKhoanchi) {
    this.rootView = rootView;
    this.rcvListKhoanchi = rcvListKhoanchi;
    this.tvTonggiaKhoanchi = tvTonggiaKhoanchi;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TabKhoanchiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TabKhoanchiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.tab_khoanchi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TabKhoanchiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rcv_list_khoanchi;
      RecyclerView rcvListKhoanchi = ViewBindings.findChildViewById(rootView, id);
      if (rcvListKhoanchi == null) {
        break missingId;
      }

      id = R.id.tv_tonggia_khoanchi;
      TextView tvTonggiaKhoanchi = ViewBindings.findChildViewById(rootView, id);
      if (tvTonggiaKhoanchi == null) {
        break missingId;
      }

      return new TabKhoanchiBinding((LinearLayout) rootView, rcvListKhoanchi, tvTonggiaKhoanchi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}