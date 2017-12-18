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

public class WaterDistributionActivity_ViewBinding implements Unbinder {
  private WaterDistributionActivity target;

  @UiThread
  public WaterDistributionActivity_ViewBinding(WaterDistributionActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WaterDistributionActivity_ViewBinding(WaterDistributionActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.rl_waterdis_apply = Utils.findRequiredViewAsType(source, R.id.rl_waterdis_apply, "field 'rl_waterdis_apply'", RelativeLayout.class);
    target.rl_waterdis_statistic = Utils.findRequiredViewAsType(source, R.id.rl_waterdis_statistic, "field 'rl_waterdis_statistic'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDistributionActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.rl_waterdis_apply = null;
    target.rl_waterdis_statistic = null;
  }
}
