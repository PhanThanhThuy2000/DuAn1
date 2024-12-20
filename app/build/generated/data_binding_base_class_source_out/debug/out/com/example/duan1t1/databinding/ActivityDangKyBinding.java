// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duan1t1.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDangKyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDangkyOn;

  @NonNull
  public final Button btnLoginReg;

  @NonNull
  public final TextInputEditText edtEmailDangnky;

  @NonNull
  public final TextInputEditText edtMatkhauDangky;

  @NonNull
  public final TextInputEditText edtRematkhauDangky;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final TextInputLayout txtConfirmPass;

  @NonNull
  public final TextInputLayout txtEmail;

  @NonNull
  public final TextInputLayout txtPass;

  private ActivityDangKyBinding(@NonNull LinearLayout rootView, @NonNull Button btnDangkyOn,
      @NonNull Button btnLoginReg, @NonNull TextInputEditText edtEmailDangnky,
      @NonNull TextInputEditText edtMatkhauDangky, @NonNull TextInputEditText edtRematkhauDangky,
      @NonNull LinearLayout main, @NonNull TextInputLayout txtConfirmPass,
      @NonNull TextInputLayout txtEmail, @NonNull TextInputLayout txtPass) {
    this.rootView = rootView;
    this.btnDangkyOn = btnDangkyOn;
    this.btnLoginReg = btnLoginReg;
    this.edtEmailDangnky = edtEmailDangnky;
    this.edtMatkhauDangky = edtMatkhauDangky;
    this.edtRematkhauDangky = edtRematkhauDangky;
    this.main = main;
    this.txtConfirmPass = txtConfirmPass;
    this.txtEmail = txtEmail;
    this.txtPass = txtPass;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDangKyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDangKyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dang_ky, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDangKyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_dangky_on;
      Button btnDangkyOn = ViewBindings.findChildViewById(rootView, id);
      if (btnDangkyOn == null) {
        break missingId;
      }

      id = R.id.btnLoginReg;
      Button btnLoginReg = ViewBindings.findChildViewById(rootView, id);
      if (btnLoginReg == null) {
        break missingId;
      }

      id = R.id.edt_email_dangnky;
      TextInputEditText edtEmailDangnky = ViewBindings.findChildViewById(rootView, id);
      if (edtEmailDangnky == null) {
        break missingId;
      }

      id = R.id.edt_matkhau_dangky;
      TextInputEditText edtMatkhauDangky = ViewBindings.findChildViewById(rootView, id);
      if (edtMatkhauDangky == null) {
        break missingId;
      }

      id = R.id.edt_rematkhau_dangky;
      TextInputEditText edtRematkhauDangky = ViewBindings.findChildViewById(rootView, id);
      if (edtRematkhauDangky == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.txtConfirmPass;
      TextInputLayout txtConfirmPass = ViewBindings.findChildViewById(rootView, id);
      if (txtConfirmPass == null) {
        break missingId;
      }

      id = R.id.txtEmail;
      TextInputLayout txtEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtEmail == null) {
        break missingId;
      }

      id = R.id.txtPass;
      TextInputLayout txtPass = ViewBindings.findChildViewById(rootView, id);
      if (txtPass == null) {
        break missingId;
      }

      return new ActivityDangKyBinding((LinearLayout) rootView, btnDangkyOn, btnLoginReg,
          edtEmailDangnky, edtMatkhauDangky, edtRematkhauDangky, main, txtConfirmPass, txtEmail,
          txtPass);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
