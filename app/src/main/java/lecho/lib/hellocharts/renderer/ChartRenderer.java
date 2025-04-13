package lecho.lib.hellocharts.renderer;

import android.graphics.Canvas;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.model.Viewport;

/* loaded from: classes3.dex */
public interface ChartRenderer {
    /* renamed from: a */
    void mo34470a();

    /* renamed from: b */
    boolean mo34486b(float f2, float f3);

    /* renamed from: c */
    void mo34487c();

    /* renamed from: d */
    void mo34488d(Canvas canvas);

    /* renamed from: e */
    void mo34471e(Viewport viewport);

    /* renamed from: f */
    void mo34472f();

    /* renamed from: g */
    Viewport mo34473g();

    /* renamed from: h */
    boolean mo34474h();

    /* renamed from: i */
    SelectedValue mo34475i();

    /* renamed from: j */
    void mo34489j(Canvas canvas);

    /* renamed from: k */
    void mo34490k();

    /* renamed from: l */
    void mo34476l();

    /* renamed from: m */
    void mo34477m(boolean z);

    /* renamed from: n */
    Viewport mo34478n();

    void setCurrentViewport(Viewport viewport);
}
