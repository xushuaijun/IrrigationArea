// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.activity.waterDistributionManage;

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

public class WaterDispatchHistoryListActivity_ViewBinding implements Unbinder {
  private WaterDispatchHistoryListActivity target;

  @UiThread
  public WaterDispatchHistoryListActivity_ViewBinding(WaterDispatchHistoryListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WaterDispatchHistoryListActivity_ViewBinding(WaterDispatchHistoryListActivity target,
      View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.lj_waterDisphis = Utils.findRequiredViewAsType(source, R.id.lj_waterDisphis, "field 'lj_waterDisphis'", LJListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDispatchHistoryListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.lj_waterDisphis = null;
  }
}
