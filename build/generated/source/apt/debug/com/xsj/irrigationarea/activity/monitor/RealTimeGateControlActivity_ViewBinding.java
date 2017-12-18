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

public class RealTimeGateControlActivity_ViewBinding implements Unbinder {
  private RealTimeGateControlActivity target;

  @UiThread
  public RealTimeGateControlActivity_ViewBinding(RealTimeGateControlActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RealTimeGateControlActivity_ViewBinding(RealTimeGateControlActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.lj_gatecontrol = Utils.findRequiredViewAsType(source, R.id.lj_gatecontrol, "field 'lj_gatecontrol'", LJListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeGateControlActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.lj_gatecontrol = null;
  }
}
