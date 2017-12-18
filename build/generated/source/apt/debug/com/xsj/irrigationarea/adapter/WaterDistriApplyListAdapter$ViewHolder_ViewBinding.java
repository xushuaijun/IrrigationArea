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

public class WaterDistriApplyListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private WaterDistriApplyListAdapter.ViewHolder target;

  @UiThread
  public WaterDistriApplyListAdapter$ViewHolder_ViewBinding(WaterDistriApplyListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_distriapplyItem = Utils.findRequiredViewAsType(source, R.id.rl_distriapplyItem, "field 'rl_distriapplyItem'", LinearLayout.class);
    target.tv_distriapply_uname = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_uname, "field 'tv_distriapply_uname'", TextView.class);
    target.tv_distriapply_benefitunit = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_benefitunit, "field 'tv_distriapply_benefitunit'", TextView.class);
    target.tv_distriapply_crop = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_crop, "field 'tv_distriapply_crop'", TextView.class);
    target.tv_distriapply_area = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_area, "field 'tv_distriapply_area'", TextView.class);
    target.tv_distriapply_beginTime = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_beginTime, "field 'tv_distriapply_beginTime'", TextView.class);
    target.tv_distriapply_endTime = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_endTime, "field 'tv_distriapply_endTime'", TextView.class);
    target.tv_distriapply_days = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_days, "field 'tv_distriapply_days'", TextView.class);
    target.tv_distriapply_reportName = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_reportName, "field 'tv_distriapply_reportName'", TextView.class);
    target.tv_distriapply_qysll = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_qysll, "field 'tv_distriapply_qysll'", TextView.class);
    target.tv_distriapply_ljysl = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_ljysl, "field 'tv_distriapply_ljysl'", TextView.class);
    target.tv_distriapply_time = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_time, "field 'tv_distriapply_time'", TextView.class);
    target.tv_distriapply_status = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_status, "field 'tv_distriapply_status'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDistriApplyListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_distriapplyItem = null;
    target.tv_distriapply_uname = null;
    target.tv_distriapply_benefitunit = null;
    target.tv_distriapply_crop = null;
    target.tv_distriapply_area = null;
    target.tv_distriapply_beginTime = null;
    target.tv_distriapply_endTime = null;
    target.tv_distriapply_days = null;
    target.tv_distriapply_reportName = null;
    target.tv_distriapply_qysll = null;
    target.tv_distriapply_ljysl = null;
    target.tv_distriapply_time = null;
    target.tv_distriapply_status = null;
  }
}
