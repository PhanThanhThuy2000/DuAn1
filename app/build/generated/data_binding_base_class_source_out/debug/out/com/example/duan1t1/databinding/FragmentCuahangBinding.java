// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duan1t1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCuahangBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView rcvCuaHang;

  @NonNull
  public final SearchView seachHangKH;

  private FragmentCuahangBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView rcvCuaHang,
      @NonNull SearchView seachHangKH) {
    this.rootView = rootView;
    this.rcvCuaHang = rcvCuaHang;
    this.seachHangKH = seachHangKH;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCuahangBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCuahangBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_cuahang, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCuahangBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rcv_cuaHang;
      RecyclerView rcvCuaHang = ViewBindings.findChildViewById(rootView, id);
      if (rcvCuaHang == null) {
        break missingId;
      }

      id = R.id.seach_Hang_KH;
      SearchView seachHangKH = ViewBindings.findChildViewById(rootView, id);
      if (seachHangKH == null) {
        break missingId;
      }

      return new FragmentCuahangBinding((LinearLayout) rootView, rcvCuaHang, seachHangKH);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}