// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.activity.monitor;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.xsj.customview.MyGridView;
import com.xsj.irrigationarea.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RealTimeVedioActivity_ViewBinding implements Unbinder {
  private RealTimeVedioActivity target;

  @UiThread
  public RealTimeVedioActivity_ViewBinding(RealTimeVedioActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RealTimeVedioActivity_ViewBinding(RealTimeVedioActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.prsv_realtimevedio = Utils.findRequiredViewAsType(source, R.id.prsv_realtimevedio, "field 'prsv_realtimevedio'", PullToRefreshScrollView.class);
    target.gv_realtimevedio = Utils.findRequiredViewAsType(source, R.id.gv_realtimevedio, "field 'gv_realtimevedio'", MyGridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeVedioActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.prsv_realtimevedio = null;
    target.gv_realtimevedio = null;
  }
}
