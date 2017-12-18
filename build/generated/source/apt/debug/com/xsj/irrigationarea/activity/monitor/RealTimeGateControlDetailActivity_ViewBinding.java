// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.activity.monitor;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.xsj.irrigationarea.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RealTimeGateControlDetailActivity_ViewBinding implements Unbinder {
  private RealTimeGateControlDetailActivity target;

  @UiThread
  public RealTimeGateControlDetailActivity_ViewBinding(RealTimeGateControlDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RealTimeGateControlDetailActivity_ViewBinding(RealTimeGateControlDetailActivity target,
      View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeGateControlDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
  }
}
