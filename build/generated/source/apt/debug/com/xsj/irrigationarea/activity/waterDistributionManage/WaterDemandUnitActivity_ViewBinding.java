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

public class WaterDemandUnitActivity_ViewBinding implements Unbinder {
  private WaterDemandUnitActivity target;

  @UiThread
  public WaterDemandUnitActivity_ViewBinding(WaterDemandUnitActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WaterDemandUnitActivity_ViewBinding(WaterDemandUnitActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.img_add = Utils.findRequiredViewAsType(source, R.id.img_add, "field 'img_add'", ImageView.class);
    target.lj_waterdemandunit = Utils.findRequiredViewAsType(source, R.id.lj_waterdemandunit, "field 'lj_waterdemandunit'", LJListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterDemandUnitActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.img_add = null;
    target.lj_waterdemandunit = null;
  }
}
