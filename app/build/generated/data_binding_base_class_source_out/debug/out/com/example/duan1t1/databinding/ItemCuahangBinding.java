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

public final class ItemCuahangBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView llXemthemMoi;

  @NonNull
  public final RecyclerView rcvListSpKhach;

  @NonNull
  public final TextView tvTenhang;

  private ItemCuahangBinding(@NonNull LinearLayout rootView, @NonNull TextView llXemthemMoi,
      @NonNull RecyclerView rcvListSpKhach, @NonNull TextView tvTenhang) {
    this.rootView = rootView;
    this.llXemthemMoi = llXemthemMoi;
    this.rcvListSpKhach = rcvListSpKhach;
    this.tvTenhang = tvTenhang;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCuahangBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCuahangBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_cuahang, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCuahangBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ll_xemthem_moi;
      TextView llXemthemMoi = ViewBindings.findChildViewById(rootView, id);
      if (llXemthemMoi == null) {
        break missingId;
      }

      id = R.id.rcv_list_sp_khach;
      RecyclerView rcvListSpKhach = ViewBindings.findChildViewById(rootView, id);
      if (rcvListSpKhach == null) {
        break missingId;
      }

      id = R.id.tv_tenhang;
      TextView tvTenhang = ViewBindings.findChildViewById(rootView, id);
      if (tvTenhang == null) {
        break missingId;
      }

      return new ItemCuahangBinding((LinearLayout) rootView, llXemthemMoi, rcvListSpKhach,
          tvTenhang);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
