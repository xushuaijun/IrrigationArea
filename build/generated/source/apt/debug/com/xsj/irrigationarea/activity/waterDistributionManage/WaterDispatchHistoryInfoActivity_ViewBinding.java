// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.activity.waterDistributionManage;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.xsj.irrigationarea.R;
import com.xsj.irrigationarea.customview.LJListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WaterDispatchHistoryInfoActivity_ViewBinding implements Unbinder {
  private WaterDispatchHistoryInfoActivity target;

  @UiThread
  public WaterDispatchHistoryInfoActivity_ViewBinding(WaterDispatchHistoryInfoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WaterDispatchHistoryInfoActivity_ViewBinding(WaterDispatchHistoryInfoActivity target,
      View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.img_refresh = Utils.findRequiredViewAsType(source, R.id.img_refresh, "field 'img_refresh'", ImageView.class);
    target.lj_waterDisphis = Utils.findRequiredViewAsType(source, R.id.lj_waterDisphis, "field 'lj_waterDisphis'", LJListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDispatchHistoryInfoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.img_refresh = null;
    target.lj_waterDisphis = null;
  }
}
