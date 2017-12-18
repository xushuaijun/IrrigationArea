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

public class RealTimeGateControlListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private RealTimeGateControlListAdapter.ViewHolder target;

  @UiThread
  public RealTimeGateControlListAdapter$ViewHolder_ViewBinding(RealTimeGateControlListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_gatecontrolItem = Utils.findRequiredViewAsType(source, R.id.rl_gatecontrolItem, "field 'rl_gatecontrolItem'", LinearLayout.class);
    target.tv_gatecontrol_cname = Utils.findRequiredViewAsType(source, R.id.tv_gatecontrol_cname, "field 'tv_gatecontrol_cname'", TextView.class);
    target.tv_gatecontrol_runstatus = Utils.findRequiredViewAsType(source, R.id.tv_gatecontrol_runstatus, "field 'tv_gatecontrol_runstatus'", TextView.class);
    target.tv_gatecontrol_gatestatus = Utils.findRequiredViewAsType(source, R.id.tv_gatecontrol_gatestatus, "field 'tv_gatecontrol_gatestatus'", TextView.class);
    target.tv_gatecontrol_time = Utils.findRequiredViewAsType(source, R.id.tv_gatecontrol_time, "field 'tv_gatecontrol_time'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeGateControlListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_gatecontrolItem = null;
    target.tv_gatecontrol_cname = null;
    target.tv_gatecontrol_runstatus = null;
    target.tv_gatecontrol_gatestatus = null;
    target.tv_gatecontrol_time = null;
  }
}
