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

public class WaterDistributionApplyActivity_ViewBinding implements Unbinder {
  private WaterDistributionApplyActivity target;

  @UiThread
  public WaterDistributionApplyActivity_ViewBinding(WaterDistributionApplyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WaterDistributionApplyActivity_ViewBinding(WaterDistributionApplyActivity target,
      View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.img_add = Utils.findRequiredViewAsType(source, R.id.img_add, "field 'img_add'", ImageView.class);
    target.lj_waterDistriApply = Utils.findRequiredViewAsType(source, R.id.lj_waterDistriApply, "field 'lj_waterDistriApply'", LJListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDistributionApplyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.img_add = null;
    target.lj_waterDistriApply = null;
  }
}
