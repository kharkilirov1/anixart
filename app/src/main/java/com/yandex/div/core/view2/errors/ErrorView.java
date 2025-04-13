package com.yandex.div.core.view2.errors;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.JsonNode;
import com.yandex.div.internal.util.SizeKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.json.ParsingException;
import java.util.Objects;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ErrorView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/errors/ErrorView;", "Lcom/yandex/div/core/Disposable;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ErrorView implements Disposable {

    /* renamed from: b */
    @NotNull
    public final ViewGroup f32892b;

    /* renamed from: c */
    @NotNull
    public final ErrorModel f32893c;

    /* renamed from: d */
    @Nullable
    public ViewGroup f32894d;

    /* renamed from: e */
    @Nullable
    public DetailsViewGroup f32895e;

    /* renamed from: f */
    @Nullable
    public ErrorViewModel f32896f;

    /* renamed from: g */
    @NotNull
    public final Disposable f32897g;

    public ErrorView(@NotNull ViewGroup viewGroup, @NotNull ErrorModel errorModel) {
        Intrinsics.m32179h(errorModel, "errorModel");
        this.f32892b = viewGroup;
        this.f32893c = errorModel;
        Function1<ErrorViewModel, Unit> function1 = new Function1<ErrorViewModel, Unit>() { // from class: com.yandex.div.core.view2.errors.ErrorView$modelObservation$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ErrorViewModel errorViewModel) {
                String value;
                ErrorViewModel m2 = errorViewModel;
                Intrinsics.m32179h(m2, "m");
                final ErrorView errorView = ErrorView.this;
                ErrorViewModel errorViewModel2 = errorView.f32896f;
                if (errorViewModel2 == null || errorViewModel2.f32901a != m2.f32901a) {
                    ViewGroup viewGroup2 = errorView.f32894d;
                    if (viewGroup2 != null) {
                        errorView.f32892b.removeView(viewGroup2);
                    }
                    errorView.f32894d = null;
                    DetailsViewGroup detailsViewGroup = errorView.f32895e;
                    if (detailsViewGroup != null) {
                        errorView.f32892b.removeView(detailsViewGroup);
                    }
                    errorView.f32895e = null;
                }
                if (m2.f32901a) {
                    if (errorView.f32895e == null) {
                        Context context = errorView.f32892b.getContext();
                        Intrinsics.m32178g(context, "root.context");
                        DetailsViewGroup detailsViewGroup2 = new DetailsViewGroup(context, new Function0<Unit>() { // from class: com.yandex.div.core.view2.errors.ErrorView$tryAddDetailsView$view$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public Unit invoke() {
                                ErrorModel errorModel2 = ErrorView.this.f32893c;
                                errorModel2.m17117a(ErrorViewModel.m17118a(errorModel2.f32888g, false, 0, 0, null, null, 30));
                                return Unit.f63088a;
                            }
                        }, new Function0<Unit>() { // from class: com.yandex.div.core.view2.errors.ErrorView$tryAddDetailsView$view$2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public Unit invoke() {
                                ErrorView errorView2 = ErrorView.this;
                                if (errorView2.f32896f != null) {
                                    ErrorModel errorModel2 = errorView2.f32893c;
                                    Objects.requireNonNull(errorModel2);
                                    JSONObject jSONObject = new JSONObject();
                                    if (errorModel2.f32884c.size() > 0) {
                                        JSONArray jSONArray = new JSONArray();
                                        for (Throwable th : errorModel2.f32884c) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put(ThrowableDeserializer.PROP_NAME_MESSAGE, ErrorVisualMonitorKt.m17122a(th));
                                            jSONObject2.put("stacktrace", ExceptionsKt.m31879b(th));
                                            if (th instanceof ParsingException) {
                                                ParsingException parsingException = (ParsingException) th;
                                                jSONObject2.put("reason", parsingException.f34318b);
                                                JsonNode jsonNode = parsingException.f34319c;
                                                jSONObject2.put("json_source", jsonNode == null ? null : jsonNode.mo17386a());
                                                jSONObject2.put("json_summary", parsingException.f34320d);
                                            }
                                            jSONArray.put(jSONObject2);
                                        }
                                        jSONObject.put("errors", jSONArray);
                                    }
                                    if (errorModel2.f32885d.size() > 0) {
                                        JSONArray jSONArray2 = new JSONArray();
                                        for (Throwable th2 : errorModel2.f32885d) {
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put("warning_message", th2.getMessage());
                                            jSONObject3.put("stacktrace", ExceptionsKt.m31879b(th2));
                                            jSONArray2.put(jSONObject3);
                                        }
                                        jSONObject.put("warnings", jSONArray2);
                                    }
                                    String jSONObject4 = jSONObject.toString(4);
                                    Intrinsics.m32178g(jSONObject4, "results.toString(/*indentSpaces*/ 4)");
                                    Object systemService = errorView2.f32892b.getContext().getSystemService("clipboard");
                                    ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                                    if (clipboardManager == null) {
                                        int i2 = Assert.f33709a;
                                    } else {
                                        clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{"text/plain"}, new ClipData.Item(jSONObject4)));
                                        Toast.makeText(errorView2.f32892b.getContext(), "Error details are at your clipboard!", 0).show();
                                    }
                                }
                                return Unit.f63088a;
                            }
                        });
                        errorView.f32892b.addView(detailsViewGroup2, new ViewGroup.LayoutParams(-1, -1));
                        errorView.f32895e = detailsViewGroup2;
                    }
                    DetailsViewGroup detailsViewGroup3 = errorView.f32895e;
                    if (detailsViewGroup3 != null) {
                        if (m2.f32902b <= 0 || m2.f32903c <= 0) {
                            value = m2.f32903c > 0 ? m2.f32905e : m2.f32904d;
                        } else {
                            value = m2.f32904d + "\n\n" + m2.f32905e;
                        }
                        Intrinsics.m32179h(value, "value");
                        detailsViewGroup3.f32874d.setText(value);
                    }
                } else {
                    boolean z = m2.m17119b().length() > 0;
                    int i2 = C2507R.drawable.error_counter_background;
                    if (!z) {
                        ViewGroup viewGroup3 = errorView.f32894d;
                        if (viewGroup3 != null) {
                            errorView.f32892b.removeView(viewGroup3);
                        }
                        errorView.f32894d = null;
                    } else if (errorView.f32894d == null) {
                        AppCompatTextView appCompatTextView = new AppCompatTextView(errorView.f32892b.getContext(), null);
                        appCompatTextView.setBackgroundResource(C2507R.drawable.error_counter_background);
                        appCompatTextView.setTextSize(12.0f);
                        appCompatTextView.setTextColor(-16777216);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setElevation(appCompatTextView.getResources().getDimension(C2507R.dimen.div_shadow_elevation));
                        appCompatTextView.setOnClickListener(new ViewOnClickListenerC2879a(errorView, 2));
                        int m17396b = SizeKt.m17396b(24);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(m17396b, m17396b);
                        int m17396b2 = SizeKt.m17396b(8);
                        marginLayoutParams.topMargin = m17396b2;
                        marginLayoutParams.leftMargin = m17396b2;
                        marginLayoutParams.rightMargin = m17396b2;
                        marginLayoutParams.bottomMargin = m17396b2;
                        Context context2 = errorView.f32892b.getContext();
                        Intrinsics.m32178g(context2, "root.context");
                        FrameContainerLayout frameContainerLayout = new FrameContainerLayout(context2, null, 0);
                        frameContainerLayout.addView(appCompatTextView, marginLayoutParams);
                        errorView.f32892b.addView(frameContainerLayout, -1, -1);
                        errorView.f32894d = frameContainerLayout;
                    }
                    ViewGroup viewGroup4 = errorView.f32894d;
                    KeyEvent.Callback childAt = viewGroup4 == null ? null : viewGroup4.getChildAt(0);
                    AppCompatTextView appCompatTextView2 = childAt instanceof AppCompatTextView ? (AppCompatTextView) childAt : null;
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setText(m2.m17119b());
                        int i3 = m2.f32903c;
                        if (i3 > 0 && m2.f32902b > 0) {
                            i2 = C2507R.drawable.warning_error_counter_background;
                        } else if (i3 > 0) {
                            i2 = C2507R.drawable.warning_counter_background;
                        }
                        appCompatTextView2.setBackgroundResource(i2);
                    }
                }
                errorView.f32896f = m2;
                return Unit.f63088a;
            }
        };
        errorModel.f32883b.add(function1);
        function1.invoke(errorModel.f32888g);
        this.f32897g = new C2880b(errorModel, function1, 1);
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.f32897g.close();
        this.f32892b.removeView(this.f32894d);
        this.f32892b.removeView(this.f32895e);
    }
}
