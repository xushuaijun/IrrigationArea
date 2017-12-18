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

public class RealTimeRainConditionListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private RealTimeRainConditionListAdapter.ViewHolder target;

  @UiThread
  public RealTimeRainConditionListAdapter$ViewHolder_ViewBinding(RealTimeRainConditionListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_rainConditionItem = Utils.findRequiredViewAsType(source, R.id.rl_rainConditionItem, "field 'rl_rainConditionItem'", LinearLayout.class);
    target.tv_raincondition_cname = Utils.findRequiredViewAsType(source, R.id.tv_raincondition_cname, "field 'tv_raincondition_cname'", TextView.class);
    target.tv_raincondition_rainfall = Utils.findRequiredViewAsType(source, R.id.tv_raincondition_rainfall, "field 'tv_raincondition_rainfall'", TextView.class);
    target.tv_raincondition_address = Utils.findRequiredViewAsType(source, R.id.tv_raincondition_address, "field 'tv_raincondition_address'", TextView.class);
    target.tv_raincondition_time = Utils.findRequiredViewAsType(source, R.id.tv_raincondition_time, "field 'tv_raincondition_time'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeRainConditionListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_rainConditionItem = null;
    target.tv_raincondition_cname = null;
    target.tv_raincondition_rainfall = null;
    target.tv_raincondition_address = null;
    target.tv_raincondition_time = null;
  }
}
