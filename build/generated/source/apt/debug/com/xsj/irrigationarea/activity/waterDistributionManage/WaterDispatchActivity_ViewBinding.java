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

public class WaterDispatchActivity_ViewBinding implements Unbinder {
  private WaterDispatchActivity target;

  @UiThread
  public WaterDispatchActivity_ViewBinding(WaterDispatchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WaterDispatchActivity_ViewBinding(WaterDispatchActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.rl_waterdisp_hisinfo = Utils.findRequiredViewAsType(source, R.id.rl_waterdisp_hisinfo, "field 'rl_waterdisp_hisinfo'", RelativeLayout.class);
    target.rl_waterdisp_dutymanage = Utils.findRequiredViewAsType(source, R.id.rl_waterdisp_dutymanage, "field 'rl_waterdisp_dutymanage'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDispatchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.rl_waterdisp_hisinfo = null;
    target.rl_waterdisp_dutymanage = null;
  }
}
