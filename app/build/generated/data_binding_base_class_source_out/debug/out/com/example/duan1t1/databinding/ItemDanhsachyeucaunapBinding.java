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
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duan1t1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemDanhsachyeucaunapBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnHuyNap;

  @NonNull
  public final AppCompatButton btnXacNhanNap;

  @NonNull
  public final ImageView imgvAnhNap;

  @NonNull
  public final TextView tvEmailNap;

  @NonNull
  public final TextView tvMaGiaoDich;

  @NonNull
  public final TextView tvMaND;

  @NonNull
  public final TextView tvSotienNap;

  private ItemDanhsachyeucaunapBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatButton btnHuyNap, @NonNull AppCompatButton btnXacNhanNap,
      @NonNull ImageView imgvAnhNap, @NonNull TextView tvEmailNap, @NonNull TextView tvMaGiaoDich,
      @NonNull TextView tvMaND, @NonNull TextView tvSotienNap) {
    this.rootView = rootView;
    this.btnHuyNap = btnHuyNap;
    this.btnXacNhanNap = btnXacNhanNap;
    this.imgvAnhNap = imgvAnhNap;
    this.tvEmailNap = tvEmailNap;
    this.tvMaGiaoDich = tvMaGiaoDich;
    this.tvMaND = tvMaND;
    this.tvSotienNap = tvSotienNap;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDanhsachyeucaunapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDanhsachyeucaunapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_danhsachyeucaunap, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDanhsachyeucaunapBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_Huy_nap;
      AppCompatButton btnHuyNap = ViewBindings.findChildViewById(rootView, id);
      if (btnHuyNap == null) {
        break missingId;
      }

      id = R.id.btn_xacNhan_nap;
      AppCompatButton btnXacNhanNap = ViewBindings.findChildViewById(rootView, id);
      if (btnXacNhanNap == null) {
        break missingId;
      }

      id = R.id.imgv_anhNap;
      ImageView imgvAnhNap = ViewBindings.findChildViewById(rootView, id);
      if (imgvAnhNap == null) {
        break missingId;
      }

      id = R.id.tv_Email_nap;
      TextView tvEmailNap = ViewBindings.findChildViewById(rootView, id);
      if (tvEmailNap == null) {
        break missingId;
      }

      id = R.id.tv_MaGiaoDich;
      TextView tvMaGiaoDich = ViewBindings.findChildViewById(rootView, id);
      if (tvMaGiaoDich == null) {
        break missingId;
      }

      id = R.id.tv_MaND;
      TextView tvMaND = ViewBindings.findChildViewById(rootView, id);
      if (tvMaND == null) {
        break missingId;
      }

      id = R.id.tv_Sotien_nap;
      TextView tvSotienNap = ViewBindings.findChildViewById(rootView, id);
      if (tvSotienNap == null) {
        break missingId;
      }

      return new ItemDanhsachyeucaunapBinding((LinearLayout) rootView, btnHuyNap, btnXacNhanNap,
          imgvAnhNap, tvEmailNap, tvMaGiaoDich, tvMaND, tvSotienNap);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
