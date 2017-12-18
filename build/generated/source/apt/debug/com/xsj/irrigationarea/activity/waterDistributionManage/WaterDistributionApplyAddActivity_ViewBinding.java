// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.activity.waterDistributionManage;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.xsj.irrigationarea.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WaterDistributionApplyAddActivity_ViewBinding implements Unbinder {
  private WaterDistributionApplyAddActivity target;

  @UiThread
  public WaterDistributionApplyAddActivity_ViewBinding(WaterDistributionApplyAddActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WaterDistributionApplyAddActivity_ViewBinding(WaterDistributionApplyAddActivity target,
      View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDistributionApplyAddActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
  }
}
