// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duan1t1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLichsuggBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvMaGG;

  @NonNull
  public final TextView tvSotienGg;

  @NonNull
  public final TextView tvThoigiangg;

  @NonNull
  public final TextView tvTrangThaiGg;

  private ItemLichsuggBinding(@NonNull LinearLayout rootView, @NonNull TextView tvMaGG,
      @NonNull TextView tvSotienGg, @NonNull TextView tvThoigiangg,
      @NonNull TextView tvTrangThaiGg) {
    this.rootView = rootView;
    this.tvMaGG = tvMaGG;
    this.tvSotienGg = tvSotienGg;
    this.tvThoigiangg = tvThoigiangg;
    this.tvTrangThaiGg = tvTrangThaiGg;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLichsuggBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLichsuggBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_lichsugg, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLichsuggBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_maGG;
      TextView tvMaGG = ViewBindings.findChildViewById(rootView, id);
      if (tvMaGG == null) {
        break missingId;
      }

      id = R.id.tv_sotien_gg;
      TextView tvSotienGg = ViewBindings.findChildViewById(rootView, id);
      if (tvSotienGg == null) {
        break missingId;
      }

      id = R.id.tv_thoigiangg;
      TextView tvThoigiangg = ViewBindings.findChildViewById(rootView, id);
      if (tvThoigiangg == null) {
        break missingId;
      }

      id = R.id.tv_trangThai_gg;
      TextView tvTrangThaiGg = ViewBindings.findChildViewById(rootView, id);
      if (tvTrangThaiGg == null) {
        break missingId;
      }

      return new ItemLichsuggBinding((LinearLayout) rootView, tvMaGG, tvSotienGg, tvThoigiangg,
          tvTrangThaiGg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
