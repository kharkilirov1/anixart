package com.yandex.div.core.view2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.activity.RunnableC0042c;
import androidx.annotation.AnyThread;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.SynchronizedList;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivVisibilityAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVisibilityActionTracker.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivVisibilityActionTracker {

    /* renamed from: a */
    @NotNull
    public final ViewVisibilityCalculator f31696a;

    /* renamed from: b */
    @NotNull
    public final DivVisibilityActionDispatcher f31697b;

    /* renamed from: c */
    @NotNull
    public final Handler f31698c;

    /* renamed from: d */
    @NotNull
    public final DivVisibilityTokenHolder f31699d;

    /* renamed from: e */
    @NotNull
    public final WeakHashMap<View, Div> f31700e;

    /* renamed from: f */
    public boolean f31701f;

    /* renamed from: g */
    @NotNull
    public final Runnable f31702g;

    /* compiled from: DivVisibilityActionTracker.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionTracker$Companion;", "", "", "TAG", "Ljava/lang/String;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @Inject
    public DivVisibilityActionTracker(@NotNull ViewVisibilityCalculator viewVisibilityCalculator, @NotNull DivVisibilityActionDispatcher visibilityActionDispatcher) {
        Intrinsics.m32179h(viewVisibilityCalculator, "viewVisibilityCalculator");
        Intrinsics.m32179h(visibilityActionDispatcher, "visibilityActionDispatcher");
        this.f31696a = viewVisibilityCalculator;
        this.f31697b = visibilityActionDispatcher;
        this.f31698c = new Handler(Looper.getMainLooper());
        this.f31699d = new DivVisibilityTokenHolder();
        this.f31700e = new WeakHashMap<>();
        this.f31702g = new RunnableC0042c(this, 15);
    }

    /* renamed from: a */
    public static final void m16872a(final DivVisibilityActionTracker divVisibilityActionTracker, final Div2View div2View, final View view, Div div, List list) {
        Objects.requireNonNull(divVisibilityActionTracker);
        Assert.m17298b();
        ViewVisibilityCalculator viewVisibilityCalculator = divVisibilityActionTracker.f31696a;
        Objects.requireNonNull(viewVisibilityCalculator);
        Intrinsics.m32179h(view, "view");
        int height = (view.isShown() && view.getGlobalVisibleRect(viewVisibilityCalculator.f31725a)) ? ((viewVisibilityCalculator.f31725a.height() * viewVisibilityCalculator.f31725a.width()) * 100) / (view.getHeight() * view.getWidth()) : 0;
        if (height > 0) {
            divVisibilityActionTracker.f31700e.put(view, div);
        } else {
            divVisibilityActionTracker.f31700e.remove(view);
        }
        if (!divVisibilityActionTracker.f31701f) {
            divVisibilityActionTracker.f31701f = true;
            divVisibilityActionTracker.f31698c.post(divVisibilityActionTracker.f31702g);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long valueOf = Long.valueOf(((DivVisibilityAction) obj).f40953g.mo17535b(div2View.getExpressionResolver()).longValue());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list2 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list2.size());
            for (Object obj3 : list2) {
                if (divVisibilityActionTracker.m16875c(div2View, view, (DivVisibilityAction) obj3, height)) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                HashMap hashMap = new HashMap(arrayList.size(), 1.0f);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DivVisibilityAction divVisibilityAction = (DivVisibilityAction) it.next();
                    CompositeLogId m16799a = CompositeLogIdKt.m16799a(div2View, divVisibilityAction);
                    KLog kLog = KLog.f33717a;
                    hashMap.put(m16799a, divVisibilityAction);
                }
                final Map<CompositeLogId, DivVisibilityAction> logIds = Collections.synchronizedMap(hashMap);
                DivVisibilityTokenHolder divVisibilityTokenHolder = divVisibilityActionTracker.f31699d;
                Intrinsics.m32178g(logIds, "logIds");
                Objects.requireNonNull(divVisibilityTokenHolder);
                SynchronizedList<Map<CompositeLogId, DivVisibilityAction>> synchronizedList = divVisibilityTokenHolder.f31716a;
                synchronized (synchronizedList.f33902a) {
                    synchronizedList.f33902a.add(logIds);
                }
                Handler handler = divVisibilityActionTracker.f31698c;
                Runnable runnable = new Runnable() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$startTracking$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        KLog kLog2 = KLog.f33717a;
                        final DivVisibilityActionDispatcher divVisibilityActionDispatcher = DivVisibilityActionTracker.this.f31697b;
                        final Div2View scope = div2View;
                        final View view2 = view;
                        Object[] array = logIds.values().toArray(new DivVisibilityAction[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        final DivVisibilityAction[] divVisibilityActionArr = (DivVisibilityAction[]) array;
                        Objects.requireNonNull(divVisibilityActionDispatcher);
                        Intrinsics.m32179h(scope, "scope");
                        Intrinsics.m32179h(view2, "view");
                        scope.m16816q(new Function0<Unit>() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher$dispatchActions$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public Unit invoke() {
                                DivVisibilityAction[] divVisibilityActionArr2 = divVisibilityActionArr;
                                DivVisibilityActionDispatcher divVisibilityActionDispatcher2 = divVisibilityActionDispatcher;
                                Div2View scope2 = scope;
                                View view3 = view2;
                                int length = divVisibilityActionArr2.length;
                                int i2 = 0;
                                while (i2 < length) {
                                    DivVisibilityAction action = divVisibilityActionArr2[i2];
                                    i2++;
                                    Objects.requireNonNull(divVisibilityActionDispatcher2);
                                    Intrinsics.m32179h(scope2, "scope");
                                    Intrinsics.m32179h(view3, "view");
                                    Intrinsics.m32179h(action, "action");
                                    CompositeLogId m16799a2 = CompositeLogIdKt.m16799a(scope2, action);
                                    Map<CompositeLogId, Integer> map = divVisibilityActionDispatcher2.f31687e;
                                    Integer num = map.get(m16799a2);
                                    if (num == null) {
                                        num = 0;
                                        map.put(m16799a2, num);
                                    }
                                    int intValue = num.intValue();
                                    long longValue2 = action.f40949c.mo17535b(scope2.getExpressionResolver()).longValue();
                                    if (longValue2 == 0 || intValue < longValue2) {
                                        if (divVisibilityActionDispatcher2.f31685c.getUseActionUid()) {
                                            String uuid = UUID.randomUUID().toString();
                                            Intrinsics.m32178g(uuid, "randomUUID().toString()");
                                            DivActionHandler actionHandler = scope2.getActionHandler();
                                            if (!(actionHandler == null ? false : actionHandler.handleAction(action, scope2, uuid)) && !divVisibilityActionDispatcher2.f31685c.handleAction(action, scope2, uuid)) {
                                                divVisibilityActionDispatcher2.f31683a.mo16579n(scope2, view3, action, uuid);
                                                divVisibilityActionDispatcher2.f31686d.m16968b(action, scope2.getExpressionResolver());
                                            }
                                        } else {
                                            DivActionHandler actionHandler2 = scope2.getActionHandler();
                                            if (!(actionHandler2 == null ? false : actionHandler2.handleAction(action, scope2)) && !divVisibilityActionDispatcher2.f31685c.handleAction(action, scope2)) {
                                                divVisibilityActionDispatcher2.f31683a.mo16567b(scope2, view3, action);
                                                divVisibilityActionDispatcher2.f31686d.m16968b(action, scope2.getExpressionResolver());
                                            }
                                        }
                                        divVisibilityActionDispatcher2.f31687e.put(m16799a2, Integer.valueOf(intValue + 1));
                                        KLog kLog3 = KLog.f33717a;
                                    }
                                }
                                return Unit.f63088a;
                            }
                        });
                    }
                };
                if (Build.VERSION.SDK_INT >= 28) {
                    handler.postDelayed(runnable, logIds, longValue);
                } else {
                    Message obtain = Message.obtain(handler, runnable);
                    obtain.obj = logIds;
                    handler.sendMessageDelayed(obtain, longValue);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m16874b(CompositeLogId compositeLogId) {
        Object obj;
        KLog kLog = KLog.f33717a;
        DivVisibilityTokenHolder divVisibilityTokenHolder = this.f31699d;
        Function1<Map<CompositeLogId, ? extends DivVisibilityAction>, Unit> function1 = new Function1<Map<CompositeLogId, ? extends DivVisibilityAction>, Unit>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$cancelTracking$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Map<CompositeLogId, ? extends DivVisibilityAction> map) {
                Map<CompositeLogId, ? extends DivVisibilityAction> emptyToken = map;
                Intrinsics.m32179h(emptyToken, "emptyToken");
                DivVisibilityActionTracker.this.f31698c.removeCallbacksAndMessages(emptyToken);
                return Unit.f63088a;
            }
        };
        Objects.requireNonNull(divVisibilityTokenHolder);
        SynchronizedList<Map<CompositeLogId, DivVisibilityAction>> synchronizedList = divVisibilityTokenHolder.f31716a;
        ArrayList arrayList = new ArrayList();
        synchronized (synchronizedList.f33902a) {
            arrayList.addAll(synchronizedList.f33902a);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map) obj).remove(compositeLogId) != null) {
                    break;
                }
            }
        }
        Map<CompositeLogId, ? extends DivVisibilityAction> map = (Map) obj;
        if (map != null && map.isEmpty()) {
            function1.invoke(map);
            SynchronizedList<Map<CompositeLogId, DivVisibilityAction>> synchronizedList2 = divVisibilityTokenHolder.f31716a;
            synchronized (synchronizedList2.f33902a) {
                synchronizedList2.f33902a.remove(map);
            }
        }
    }

    /* renamed from: c */
    public final boolean m16875c(Div2View div2View, View view, DivVisibilityAction divVisibilityAction, int i2) {
        CompositeLogId compositeLogId;
        Object obj;
        Set keySet;
        boolean z = ((long) i2) >= divVisibilityAction.f40954h.mo17535b(div2View.getExpressionResolver()).longValue();
        CompositeLogId m16799a = CompositeLogIdKt.m16799a(div2View, divVisibilityAction);
        DivVisibilityTokenHolder divVisibilityTokenHolder = this.f31699d;
        Objects.requireNonNull(divVisibilityTokenHolder);
        SynchronizedList<Map<CompositeLogId, DivVisibilityAction>> synchronizedList = divVisibilityTokenHolder.f31716a;
        ArrayList arrayList = new ArrayList();
        synchronized (synchronizedList.f33902a) {
            arrayList.addAll(synchronizedList.f33902a);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            compositeLogId = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Map) obj).containsKey(m16799a)) {
                break;
            }
        }
        Map map = (Map) obj;
        if (map != null && (keySet = map.keySet()) != null) {
            Object[] array = keySet.toArray(new CompositeLogId[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            CompositeLogId[] compositeLogIdArr = (CompositeLogId[]) array;
            int length = compositeLogIdArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                CompositeLogId compositeLogId2 = compositeLogIdArr[i3];
                i3++;
                if (Intrinsics.m32174c(compositeLogId2, m16799a)) {
                    compositeLogId = compositeLogId2;
                    break;
                }
            }
        }
        if (view != null && compositeLogId == null && z) {
            return true;
        }
        if ((view == null || compositeLogId != null || z) && (view == null || compositeLogId == null || !z)) {
            if (view != null && compositeLogId != null && !z) {
                m16874b(compositeLogId);
            } else if (view == null && compositeLogId != null) {
                m16874b(compositeLogId);
            }
        }
        return false;
    }

    @AnyThread
    /* renamed from: d */
    public void m16876d(@NotNull final Div2View scope, @Nullable final View view, @NotNull final Div div, @NotNull final List<? extends DivVisibilityAction> visibilityActions) {
        Intrinsics.m32179h(scope, "scope");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(visibilityActions, "visibilityActions");
        if (visibilityActions.isEmpty()) {
            return;
        }
        final DivData divData = scope.getDivData();
        if (view == null) {
            Iterator<T> it = visibilityActions.iterator();
            while (it.hasNext()) {
                m16875c(scope, view, (DivVisibilityAction) it.next(), 0);
            }
            return;
        }
        if ((ViewsKt.m16767a(view) == null) && !view.isLayoutRequested()) {
            if (Intrinsics.m32174c(scope.getDivData(), divData)) {
                m16872a(this, scope, view, div, visibilityActions);
            }
        } else {
            View m16767a = ViewsKt.m16767a(view);
            if (m16767a == null) {
                return;
            }
            m16767a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$trackVisibilityActionsOf$$inlined$doOnHierarchyLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Intrinsics.m32179h(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    if (Intrinsics.m32174c(Div2View.this.getDivData(), divData)) {
                        DivVisibilityActionTracker.m16872a(this, Div2View.this, view, div, visibilityActions);
                    }
                }
            });
        }
    }
}
