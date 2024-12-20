// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duan1t1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogLichsuBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final RecyclerView rcvListLichsu;

  @NonNull
  public final TextView tvThongbaoRong;

  private DialogLichsuBinding(@NonNull CardView rootView, @NonNull RecyclerView rcvListLichsu,
      @NonNull TextView tvThongbaoRong) {
    this.rootView = rootView;
    this.rcvListLichsu = rcvListLichsu;
    this.tvThongbaoRong = tvThongbaoRong;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogLichsuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogLichsuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_lichsu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogLichsuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rcv_list_lichsu;
      RecyclerView rcvListLichsu = ViewBindings.findChildViewById(rootView, id);
      if (rcvListLichsu == null) {
        break missingId;
      }

      id = R.id.tv_thongbao_rong;
      TextView tvThongbaoRong = ViewBindings.findChildViewById(rootView, id);
      if (tvThongbaoRong == null) {
        break missingId;
      }

      return new DialogLichsuBinding((CardView) rootView, rcvListLichsu, tvThongbaoRong);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
