// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duan1t1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogQuenpassBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final AppCompatButton btnQuen;

  @NonNull
  public final EditText edtEmailQuen;

  private DialogQuenpassBinding(@NonNull CardView rootView, @NonNull AppCompatButton btnQuen,
      @NonNull EditText edtEmailQuen) {
    this.rootView = rootView;
    this.btnQuen = btnQuen;
    this.edtEmailQuen = edtEmailQuen;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogQuenpassBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogQuenpassBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_quenpass, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogQuenpassBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_quen;
      AppCompatButton btnQuen = ViewBindings.findChildViewById(rootView, id);
      if (btnQuen == null) {
        break missingId;
      }

      id = R.id.edt_email_quen;
      EditText edtEmailQuen = ViewBindings.findChildViewById(rootView, id);
      if (edtEmailQuen == null) {
        break missingId;
      }

      return new DialogQuenpassBinding((CardView) rootView, btnQuen, edtEmailQuen);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
