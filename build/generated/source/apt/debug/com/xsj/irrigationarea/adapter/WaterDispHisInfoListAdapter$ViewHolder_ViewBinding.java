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

public class WaterDispHisInfoListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private WaterDispHisInfoListAdapter.ViewHolder target;

  @UiThread
  public WaterDispHisInfoListAdapter$ViewHolder_ViewBinding(WaterDispHisInfoListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_disphisinfoItem = Utils.findRequiredViewAsType(source, R.id.rl_disphisinfoItem, "field 'rl_disphisinfoItem'", LinearLayout.class);
    target.tv_disphisinfo_uname = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_uname, "field 'tv_disphisinfo_uname'", TextView.class);
    target.tv_disphisinfo_benefitunit = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_benefitunit, "field 'tv_disphisinfo_benefitunit'", TextView.class);
    target.tv_disphisinfo_crop = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_crop, "field 'tv_disphisinfo_crop'", TextView.class);
    target.tv_disphisinfo_area = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_area, "field 'tv_disphisinfo_area'", TextView.class);
    target.tv_disphisinfo_beginTime = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_beginTime, "field 'tv_disphisinfo_beginTime'", TextView.class);
    target.tv_disphisinfo_endTime = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_endTime, "field 'tv_disphisinfo_endTime'", TextView.class);
    target.tv_disphisinfo_days = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_days, "field 'tv_disphisinfo_days'", TextView.class);
    target.tv_disphisinfo_open = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_open, "field 'tv_disphisinfo_open'", TextView.class);
    target.tv_disphisinfo_qysll = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_qysll, "field 'tv_disphisinfo_qysll'", TextView.class);
    target.tv_disphisinfo_ljysl = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_ljysl, "field 'tv_disphisinfo_ljysl'", TextView.class);
    target.tv_distriapply_ztime = Utils.findRequiredViewAsType(source, R.id.tv_distriapply_ztime, "field 'tv_distriapply_ztime'", TextView.class);
    target.tv_disphisinfo_opentime = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_opentime, "field 'tv_disphisinfo_opentime'", TextView.class);
    target.tv_disphisinfo_closetime = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_closetime, "field 'tv_disphisinfo_closetime'", TextView.class);
    target.tv_disphisinfo_dispname = Utils.findRequiredViewAsType(source, R.id.tv_disphisinfo_dispname, "field 'tv_disphisinfo_dispname'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDispHisInfoListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_disphisinfoItem = null;
    target.tv_disphisinfo_uname = null;
    target.tv_disphisinfo_benefitunit = null;
    target.tv_disphisinfo_crop = null;
    target.tv_disphisinfo_area = null;
    target.tv_disphisinfo_beginTime = null;
    target.tv_disphisinfo_endTime = null;
    target.tv_disphisinfo_days = null;
    target.tv_disphisinfo_open = null;
    target.tv_disphisinfo_qysll = null;
    target.tv_disphisinfo_ljysl = null;
    target.tv_distriapply_ztime = null;
    target.tv_disphisinfo_opentime = null;
    target.tv_disphisinfo_closetime = null;
    target.tv_disphisinfo_dispname = null;
  }
}
