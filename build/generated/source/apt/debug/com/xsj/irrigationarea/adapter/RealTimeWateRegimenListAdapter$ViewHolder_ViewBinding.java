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

public class RealTimeWateRegimenListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private RealTimeWateRegimenListAdapter.ViewHolder target;

  @UiThread
  public RealTimeWateRegimenListAdapter$ViewHolder_ViewBinding(RealTimeWateRegimenListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_wateregimenItem = Utils.findRequiredViewAsType(source, R.id.rl_wateregimenItem, "field 'rl_wateregimenItem'", LinearLayout.class);
    target.tv_wateregimen_qname = Utils.findRequiredViewAsType(source, R.id.tv_wateregimen_qname, "field 'tv_wateregimen_qname'", TextView.class);
    target.tv_wateregimen_flowrate = Utils.findRequiredViewAsType(source, R.id.tv_wateregimen_flowrate, "field 'tv_wateregimen_flowrate'", TextView.class);
    target.tv_wateregimen_level = Utils.findRequiredViewAsType(source, R.id.tv_wateregimen_level, "field 'tv_wateregimen_level'", TextView.class);
    target.tv_wateregimen_sflowrate = Utils.findRequiredViewAsType(source, R.id.tv_wateregimen_sflowrate, "field 'tv_wateregimen_sflowrate'", TextView.class);
    target.tv_wateregimen_lflowrate = Utils.findRequiredViewAsType(source, R.id.tv_wateregimen_lflowrate, "field 'tv_wateregimen_lflowrate'", TextView.class);
    target.tv_waterlevel_temp = Utils.findRequiredViewAsType(source, R.id.tv_waterlevel_temp, "field 'tv_waterlevel_temp'", TextView.class);
    target.tv_wateregimen_time = Utils.findRequiredViewAsType(source, R.id.tv_wateregimen_time, "field 'tv_wateregimen_time'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeWateRegimenListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_wateregimenItem = null;
    target.tv_wateregimen_qname = null;
    target.tv_wateregimen_flowrate = null;
    target.tv_wateregimen_level = null;
    target.tv_wateregimen_sflowrate = null;
    target.tv_wateregimen_lflowrate = null;
    target.tv_waterlevel_temp = null;
    target.tv_wateregimen_time = null;
  }
}
