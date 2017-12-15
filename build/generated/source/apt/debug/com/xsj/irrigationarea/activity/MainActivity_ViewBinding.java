// Generated code from Butter Knife. Do not modify!
package com.xsj.irrigationarea.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bigkoo.convenientbanner.ConvenientBanner;
import com.xsj.irrigationarea.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.returnBtn = Utils.findRequiredViewAsType(source, R.id.returnBtn, "field 'returnBtn'", ImageButton.class);
    target.id_cb = Utils.findRequiredViewAsType(source, R.id.id_cb, "field 'id_cb'", ConvenientBanner.class);
    target.tv_main_waterlevel = Utils.findRequiredViewAsType(source, R.id.tv_main_waterlevel, "field 'tv_main_waterlevel'", TextView.class);
    target.tv_main_wateregimen = Utils.findRequiredViewAsType(source, R.id.tv_main_wateregimen, "field 'tv_main_wateregimen'", TextView.class);
    target.tv_main_raincondition = Utils.findRequiredViewAsType(source, R.id.tv_main_raincondition, "field 'tv_main_raincondition'", TextView.class);
    target.tv_main_gatecontroll = Utils.findRequiredViewAsType(source, R.id.tv_main_gatecontroll, "field 'tv_main_gatecontroll'", TextView.class);
    target.tv_main_video = Utils.findRequiredViewAsType(source, R.id.tv_main_video, "field 'tv_main_video'", TextView.class);
    target.tv_main_waterquality = Utils.findRequiredViewAsType(source, R.id.tv_main_waterquality, "field 'tv_main_waterquality'", TextView.class);
    target.tv_main_waterdemand = Utils.findRequiredViewAsType(source, R.id.tv_main_waterdemand, "field 'tv_main_waterdemand'", TextView.class);
    target.tv_main_waterdistribution = Utils.findRequiredViewAsType(source, R.id.tv_main_waterdistribution, "field 'tv_main_waterdistribution'", TextView.class);
    target.tv_main_dispatch = Utils.findRequiredViewAsType(source, R.id.tv_main_dispatch, "field 'tv_main_dispatch'", TextView.class);
    target.tv_main_projectinfo = Utils.findRequiredViewAsType(source, R.id.tv_main_projectinfo, "field 'tv_main_projectinfo'", TextView.class);
    target.tv_main_basicinfo = Utils.findRequiredViewAsType(source, R.id.tv_main_basicinfo, "field 'tv_main_basicinfo'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.returnBtn = null;
    target.id_cb = null;
    target.tv_main_waterlevel = null;
    target.tv_main_wateregimen = null;
    target.tv_main_raincondition = null;
    target.tv_main_gatecontroll = null;
    target.tv_main_video = null;
    target.tv_main_waterquality = null;
    target.tv_main_waterdemand = null;
    target.tv_main_waterdistribution = null;
    target.tv_main_dispatch = null;
    target.tv_main_projectinfo = null;
    target.tv_main_basicinfo = null;
  }
}
