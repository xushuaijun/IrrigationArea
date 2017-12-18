// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.xsj.irrigationarea.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RealTimeVideoGridAdapter$ViewHolder_ViewBinding implements Unbinder {
  private RealTimeVideoGridAdapter.ViewHolder target;

  @UiThread
  public RealTimeVideoGridAdapter$ViewHolder_ViewBinding(RealTimeVideoGridAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_grid_realtimevedio = Utils.findRequiredViewAsType(source, R.id.rl_grid_realtimevedio, "field 'rl_grid_realtimevedio'", RelativeLayout.class);
    target.img_rtvideo_icon = Utils.findRequiredViewAsType(source, R.id.img_rtvideo_icon, "field 'img_rtvideo_icon'", ImageView.class);
    target.img_rtvideo_title = Utils.findRequiredViewAsType(source, R.id.img_rtvideo_title, "field 'img_rtvideo_title'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeVideoGridAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_grid_realtimevedio = null;
    target.img_rtvideo_icon = null;
    target.img_rtvideo_title = null;
  }
}
