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

public class WaterDispDutyManageListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private WaterDispDutyManageListAdapter.ViewHolder target;

  @UiThread
  public WaterDispDutyManageListAdapter$ViewHolder_ViewBinding(WaterDispDutyManageListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.rl_dispdutymanageItem = Utils.findRequiredViewAsType(source, R.id.rl_dispdutymanageItem, "field 'rl_dispdutymanageItem'", LinearLayout.class);
    target.tv_dispdutymanage_name = Utils.findRequiredViewAsType(source, R.id.tv_dispdutymanage_name, "field 'tv_dispdutymanage_name'", TextView.class);
    target.tv_dispdutymanage_gender = Utils.findRequiredViewAsType(source, R.id.tv_dispdutymanage_gender, "field 'tv_dispdutymanage_gender'", TextView.class);
    target.tv_dispdutymanage_phone = Utils.findRequiredViewAsType(source, R.id.tv_dispdutymanage_phone, "field 'tv_dispdutymanage_phone'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDispDutyManageListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_dispdutymanageItem = null;
    target.tv_dispdutymanage_name = null;
    target.tv_dispdutymanage_gender = null;
    target.tv_dispdutymanage_phone = null;
  }
}
