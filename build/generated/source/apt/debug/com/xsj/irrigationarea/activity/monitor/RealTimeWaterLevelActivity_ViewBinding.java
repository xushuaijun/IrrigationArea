// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.activity.monitor;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.xsj.irrigationarea.R;
import com.xsj.irrigationarea.customview.LJListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RealTimeWaterLevelActivity_ViewBinding implements Unbinder {
  private RealTimeWaterLevelActivity target;

  @UiThread
  public RealTimeWaterLevelActivity_ViewBinding(RealTimeWaterLevelActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RealTimeWaterLevelActivity_ViewBinding(RealTimeWaterLevelActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.lj_waterlevel = Utils.findRequiredViewAsType(source, R.id.lj_waterlevel, "field 'lj_waterlevel'", LJListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeWaterLevelActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.lj_waterlevel = null;
  }
}
