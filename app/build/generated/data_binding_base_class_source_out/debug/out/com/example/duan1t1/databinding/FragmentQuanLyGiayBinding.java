// Generated by view binder compiler. Do not edit!
package com.example.duan1t1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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

public final class FragmentQuanLyGiayBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton ibtnThemSp;

  @NonNull
  public final RecyclerView rcvQlsp;

  @NonNull
  public final SearchView svTimsp;

  private FragmentQuanLyGiayBinding(@NonNull LinearLayout rootView, @NonNull ImageButton ibtnThemSp,
      @NonNull RecyclerView rcvQlsp, @NonNull SearchView svTimsp) {
    this.rootView = rootView;
    this.ibtnThemSp = ibtnThemSp;
    this.rcvQlsp = rcvQlsp;
    this.svTimsp = svTimsp;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQuanLyGiayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQuanLyGiayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_quan_ly_giay, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQuanLyGiayBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ibtn_them_sp;
      ImageButton ibtnThemSp = ViewBindings.findChildViewById(rootView, id);
      if (ibtnThemSp == null) {
        break missingId;
      }

      id = R.id.rcv_qlsp;
      RecyclerView rcvQlsp = ViewBindings.findChildViewById(rootView, id);
      if (rcvQlsp == null) {
        break missingId;
      }

      id = R.id.sv_timsp;
      SearchView svTimsp = ViewBindings.findChildViewById(rootView, id);
      if (svTimsp == null) {
        break missingId;
      }

      return new FragmentQuanLyGiayBinding((LinearLayout) rootView, ibtnThemSp, rcvQlsp, svTimsp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}