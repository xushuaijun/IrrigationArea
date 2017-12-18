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

public class RealTimeWaterLevelListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private RealTimeWaterLevelListAdapter.ViewHolder target;

  @UiThread
  public RealTimeWaterLevelListAdapter$ViewHolder_ViewBinding(RealTimeWaterLevelListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_waterlevelItem = Utils.findRequiredViewAsType(source, R.id.rl_waterlevelItem, "field 'rl_waterlevelItem'", LinearLayout.class);
    target.tv_waterlevel_zname = Utils.findRequiredViewAsType(source, R.id.tv_waterlevel_zname, "field 'tv_waterlevel_zname'", TextView.class);
    target.tv_waterlevel_zaddess = Utils.findRequiredViewAsType(source, R.id.tv_waterlevel_zaddess, "field 'tv_waterlevel_zaddess'", TextView.class);
    target.tv_waterlevel_level = Utils.findRequiredViewAsType(source, R.id.tv_waterlevel_level, "field 'tv_waterlevel_level'", TextView.class);
    target.tv_waterlevel_flowrate = Utils.findRequiredViewAsType(source, R.id.tv_waterlevel_flowrate, "field 'tv_waterlevel_flowrate'", TextView.class);
    target.tv_waterlevel_time = Utils.findRequiredViewAsType(source, R.id.tv_waterlevel_time, "field 'tv_waterlevel_time'", TextView.class);
    target.tv_waterlevel_status = Utils.findRequiredViewAsType(source, R.id.tv_waterlevel_status, "field 'tv_waterlevel_status'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeWaterLevelListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_waterlevelItem = null;
    target.tv_waterlevel_zname = null;
    target.tv_waterlevel_zaddess = null;
    target.tv_waterlevel_level = null;
    target.tv_waterlevel_flowrate = null;
    target.tv_waterlevel_time = null;
    target.tv_waterlevel_status = null;
  }
}
