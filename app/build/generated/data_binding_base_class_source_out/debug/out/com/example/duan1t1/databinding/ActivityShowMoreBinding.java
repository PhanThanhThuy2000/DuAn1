// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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

public final class ActivityShowMoreBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivClose;

  @NonNull
  public final RecyclerView rcvListSanPhamMore;

  @NonNull
  public final SearchView seachSpKH;

  @NonNull
  public final TextView tvTenHangShow;

  private ActivityShowMoreBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivClose,
      @NonNull RecyclerView rcvListSanPhamMore, @NonNull SearchView seachSpKH,
      @NonNull TextView tvTenHangShow) {
    this.rootView = rootView;
    this.ivClose = ivClose;
    this.rcvListSanPhamMore = rcvListSanPhamMore;
    this.seachSpKH = seachSpKH;
    this.tvTenHangShow = tvTenHangShow;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShowMoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShowMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_show_more, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShowMoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_close;
      ImageView ivClose = ViewBindings.findChildViewById(rootView, id);
      if (ivClose == null) {
        break missingId;
      }

      id = R.id.rcv_list_sanPham_more;
      RecyclerView rcvListSanPhamMore = ViewBindings.findChildViewById(rootView, id);
      if (rcvListSanPhamMore == null) {
        break missingId;
      }

      id = R.id.seach_sp_KH;
      SearchView seachSpKH = ViewBindings.findChildViewById(rootView, id);
      if (seachSpKH == null) {
        break missingId;
      }

      id = R.id.tv_ten_hang_show;
      TextView tvTenHangShow = ViewBindings.findChildViewById(rootView, id);
      if (tvTenHangShow == null) {
        break missingId;
      }

      return new ActivityShowMoreBinding((LinearLayout) rootView, ivClose, rcvListSanPhamMore,
          seachSpKH, tvTenHangShow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
