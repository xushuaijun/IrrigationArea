// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.xsj.irrigationarea.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RealTimeWaterQualityListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private RealTimeWaterQualityListAdapter.ViewHolder target;

  @UiThread
  public RealTimeWaterQualityListAdapter$ViewHolder_ViewBinding(RealTimeWaterQualityListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_waterQualityItem = Utils.findRequiredViewAsType(source, R.id.rl_waterQualityItem, "field 'rl_waterQualityItem'", LinearLayout.class);
    target.tv_waterquality_cname = Utils.findRequiredViewAsType(source, R.id.tv_waterquality_cname, "field 'tv_waterquality_cname'", TextView.class);
    target.tv_waterquality_temp = Utils.findRequiredViewAsType(source, R.id.tv_waterquality_temp, "field 'tv_waterquality_temp'", TextView.class);
    target.tv_waterquality_ph = Utils.findRequiredViewAsType(source, R.id.tv_waterquality_ph, "field 'tv_waterquality_ph'", TextView.class);
    target.tv_waterquality_ry = Utils.findRequiredViewAsType(source, R.id.tv_waterquality_ry, "field 'tv_waterquality_ry'", TextView.class);
    target.tv_waterquality_dd = Utils.findRequiredViewAsType(source, R.id.tv_waterquality_dd, "field 'tv_waterquality_dd'", TextView.class);
    target.tv_waterquality_zd = Utils.findRequiredViewAsType(source, R.id.tv_waterquality_zd, "field 'tv_waterquality_zd'", TextView.class);
    target.tv_waterquality_time = Utils.findRequiredViewAsType(source, R.id.tv_waterquality_time, "field 'tv_waterquality_time'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeWaterQualityListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_waterQualityItem = null;
    target.tv_waterquality_cname = null;
    target.tv_waterquality_temp = null;
    target.tv_waterquality_ph = null;
    target.tv_waterquality_ry = null;
    target.tv_waterquality_dd = null;
    target.tv_waterquality_zd = null;
    target.tv_waterquality_time = null;
  }
}
