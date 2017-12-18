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

public class WaterDemandUnitListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private WaterDemandUnitListAdapter.ViewHolder target;

  @UiThread
  public WaterDemandUnitListAdapter$ViewHolder_ViewBinding(WaterDemandUnitListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_waterUnitItem = Utils.findRequiredViewAsType(source, R.id.rl_waterUnitItem, "field 'rl_waterUnitItem'", LinearLayout.class);
    target.tv_waterunit_uname = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_uname, "field 'tv_waterunit_uname'", TextView.class);
    target.tv_waterunit_benefitunit = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_benefitunit, "field 'tv_waterunit_benefitunit'", TextView.class);
    target.tv_waterunit_crop = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_crop, "field 'tv_waterunit_crop'", TextView.class);
    target.tv_waterunit_area = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_area, "field 'tv_waterunit_area'", TextView.class);
    target.tv_waterunit_beginTime = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_beginTime, "field 'tv_waterunit_beginTime'", TextView.class);
    target.tv_waterunit_endTime = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_endTime, "field 'tv_waterunit_endTime'", TextView.class);
    target.tv_waterunit_days = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_days, "field 'tv_waterunit_days'", TextView.class);
    target.tv_waterunit_reportName = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_reportName, "field 'tv_waterunit_reportName'", TextView.class);
    target.tv_waterunit_qysll = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_qysll, "field 'tv_waterunit_qysll'", TextView.class);
    target.tv_waterunit_time = Utils.findRequiredViewAsType(source, R.id.tv_waterunit_time, "field 'tv_waterunit_time'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDemandUnitListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_waterUnitItem = null;
    target.tv_waterunit_uname = null;
    target.tv_waterunit_benefitunit = null;
    target.tv_waterunit_crop = null;
    target.tv_waterunit_area = null;
    target.tv_waterunit_beginTime = null;
    target.tv_waterunit_endTime = null;
    target.tv_waterunit_days = null;
    target.tv_waterunit_reportName = null;
    target.tv_waterunit_qysll = null;
    target.tv_waterunit_time = null;
  }
}
