// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.activity.waterDistributionManage;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.xsj.irrigationarea.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WaterDemandActivity_ViewBinding implements Unbinder {
  private WaterDemandActivity target;

  @UiThread
  public WaterDemandActivity_ViewBinding(WaterDemandActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WaterDemandActivity_ViewBinding(WaterDemandActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.rl_waterdemand_unit = Utils.findRequiredViewAsType(source, R.id.rl_waterdemand_unit, "field 'rl_waterdemand_unit'", RelativeLayout.class);
    target.rl_waterdemand_maincanal = Utils.findRequiredViewAsType(source, R.id.rl_waterdemand_maincanal, "field 'rl_waterdemand_maincanal'", RelativeLayout.class);
    target.rl_waterdemand_branchcanal = Utils.findRequiredViewAsType(source, R.id.rl_waterdemand_branchcanal, "field 'rl_waterdemand_branchcanal'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDemandActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.rl_waterdemand_unit = null;
    target.rl_waterdemand_maincanal = null;
    target.rl_waterdemand_branchcanal = null;
  }
}
