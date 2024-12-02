// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duan1t1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogNaptienBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnGui;

  @NonNull
  public final AppCompatButton btnHuyYc;

  @NonNull
  public final EditText edtEmailNaptien;

  @NonNull
  public final EditText edtSotien;

  @NonNull
  public final ImageView imvAnhchupmanhinh;

  private DialogNaptienBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btnGui,
      @NonNull AppCompatButton btnHuyYc, @NonNull EditText edtEmailNaptien,
      @NonNull EditText edtSotien, @NonNull ImageView imvAnhchupmanhinh) {
    this.rootView = rootView;
    this.btnGui = btnGui;
    this.btnHuyYc = btnHuyYc;
    this.edtEmailNaptien = edtEmailNaptien;
    this.edtSotien = edtSotien;
    this.imvAnhchupmanhinh = imvAnhchupmanhinh;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogNaptienBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogNaptienBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_naptien, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogNaptienBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_gui;
      AppCompatButton btnGui = ViewBindings.findChildViewById(rootView, id);
      if (btnGui == null) {
        break missingId;
      }

      id = R.id.btn_Huy_yc;
      AppCompatButton btnHuyYc = ViewBindings.findChildViewById(rootView, id);
      if (btnHuyYc == null) {
        break missingId;
      }

      id = R.id.edt_email_naptien;
      EditText edtEmailNaptien = ViewBindings.findChildViewById(rootView, id);
      if (edtEmailNaptien == null) {
        break missingId;
      }

      id = R.id.edt_sotien;
      EditText edtSotien = ViewBindings.findChildViewById(rootView, id);
      if (edtSotien == null) {
        break missingId;
      }

      id = R.id.imv_anhchupmanhinh;
      ImageView imvAnhchupmanhinh = ViewBindings.findChildViewById(rootView, id);
      if (imvAnhchupmanhinh == null) {
        break missingId;
      }

      return new DialogNaptienBinding((LinearLayout) rootView, btnGui, btnHuyYc, edtEmailNaptien,
          edtSotien, imvAnhchupmanhinh);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
