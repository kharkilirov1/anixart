package com.yandex.div.core;

import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPreloader.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div/core/DivPreloader;", "", "Callback", "Companion", "DownloadCallback", "PreloadReference", "PreloadVisitor", "Ticket", "TicketImpl", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPreloader {

    /* renamed from: d */
    public static final /* synthetic */ int f30970d = 0;

    /* renamed from: a */
    @Nullable
    public final DivImagePreloader f30971a;

    /* renamed from: b */
    @Nullable
    public final DivCustomViewAdapter f30972b;

    /* renamed from: c */
    @NotNull
    public final DivExtensionController f30973c;

    /* compiled from: DivPreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/DivPreloader$Callback;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface Callback {
        /* renamed from: g */
        void mo16589g(boolean z);
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/DivPreloader$Companion;", "", "Lcom/yandex/div/core/DivPreloader$Callback;", "NO_CALLBACK", "Lcom/yandex/div/core/DivPreloader$Callback;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class DownloadCallback extends DivImageDownloadCallback {

        /* renamed from: a */
        @NotNull
        public final Callback f30974a;

        /* renamed from: b */
        @NotNull
        public AtomicInteger f30975b = new AtomicInteger(0);

        /* renamed from: c */
        @NotNull
        public AtomicInteger f30976c = new AtomicInteger(0);

        /* renamed from: d */
        @NotNull
        public AtomicBoolean f30977d = new AtomicBoolean(false);

        public DownloadCallback(@NotNull Callback callback) {
            this.f30974a = callback;
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        /* renamed from: a */
        public void mo16590a() {
            this.f30976c.incrementAndGet();
            m16592c();
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        /* renamed from: b */
        public void mo16591b(@NotNull CachedBitmap cachedBitmap) {
            m16592c();
        }

        /* renamed from: c */
        public final void m16592c() {
            this.f30975b.decrementAndGet();
            if (this.f30975b.get() == 0 && this.f30977d.get()) {
                this.f30974a.mo16589g(this.f30976c.get() != 0);
            }
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadReference;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface PreloadReference {

        /* renamed from: a */
        @NotNull
        public static final Companion f30978a = Companion.f30979a;

        /* compiled from: DivPreloader.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadReference$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ Companion f30979a = new Companion();
        }

        void cancel();
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivVisitor;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class PreloadVisitor extends DivVisitor<Unit> {

        /* renamed from: a */
        @NotNull
        public final DownloadCallback f30980a;

        /* renamed from: b */
        @NotNull
        public final Callback f30981b;

        /* renamed from: c */
        @NotNull
        public final ExpressionResolver f30982c;

        /* renamed from: d */
        @NotNull
        public final TicketImpl f30983d = new TicketImpl();

        public PreloadVisitor(@NotNull DownloadCallback downloadCallback, @NotNull Callback callback, @NotNull ExpressionResolver expressionResolver) {
            this.f30980a = downloadCallback;
            this.f30981b = callback;
            this.f30982c = expressionResolver;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Unit mo16593a(Div div, ExpressionResolver expressionResolver) {
            m16601n(div, expressionResolver);
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: b */
        public Unit mo16594b(Div.Container container, ExpressionResolver expressionResolver) {
            Iterator<T> it = container.f34421c.f34953t.iterator();
            while (it.hasNext()) {
                m17303m((Div) it.next(), expressionResolver);
            }
            m16601n(container, expressionResolver);
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: c */
        public Unit mo16595c(Div.Custom custom, ExpressionResolver expressionResolver) {
            PreloadReference preload;
            List<Div> list = custom.f34422c.f35300o;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    m17303m((Div) it.next(), expressionResolver);
                }
            }
            DivCustomViewAdapter divCustomViewAdapter = DivPreloader.this.f30972b;
            if (divCustomViewAdapter != null && (preload = divCustomViewAdapter.preload(custom.f34422c, this.f30981b)) != null) {
                TicketImpl ticketImpl = this.f30983d;
                Objects.requireNonNull(ticketImpl);
                ticketImpl.f30985a.add(preload);
            }
            m16601n(custom, expressionResolver);
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: d */
        public Unit mo16596d(Div.Gallery gallery, ExpressionResolver expressionResolver) {
            Iterator<T> it = gallery.f34423c.f35956r.iterator();
            while (it.hasNext()) {
                m17303m((Div) it.next(), expressionResolver);
            }
            m16601n(gallery, expressionResolver);
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: f */
        public Unit mo16597f(Div.Grid grid, ExpressionResolver expressionResolver) {
            Iterator<T> it = grid.f34425c.f36481t.iterator();
            while (it.hasNext()) {
                m17303m((Div) it.next(), expressionResolver);
            }
            m16601n(grid, expressionResolver);
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: h */
        public Unit mo16598h(Div.Pager pager, ExpressionResolver expressionResolver) {
            Iterator<T> it = pager.f34429c.f37799o.iterator();
            while (it.hasNext()) {
                m17303m((Div) it.next(), expressionResolver);
            }
            m16601n(pager, expressionResolver);
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: j */
        public Unit mo16599j(Div.State state, ExpressionResolver expressionResolver) {
            Iterator<T> it = state.f34433c.f39242s.iterator();
            while (it.hasNext()) {
                Div div = ((DivState.State) it.next()).f39259c;
                if (div != null) {
                    m17303m(div, expressionResolver);
                }
            }
            m16601n(state, expressionResolver);
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: k */
        public Unit mo16600k(Div.Tabs tabs, ExpressionResolver expressionResolver) {
            Iterator<T> it = tabs.f34434c.f39522o.iterator();
            while (it.hasNext()) {
                m17303m(((DivTabs.Item) it.next()).f39540a, expressionResolver);
            }
            m16601n(tabs, expressionResolver);
            return Unit.f63088a;
        }

        /* renamed from: n */
        public void m16601n(@NotNull Div data, @NotNull ExpressionResolver resolver) {
            List<LoadReference> m16856b;
            Intrinsics.m32179h(data, "data");
            Intrinsics.m32179h(resolver, "resolver");
            DivImagePreloader divImagePreloader = DivPreloader.this.f30971a;
            if (divImagePreloader != null && (m16856b = divImagePreloader.m16856b(data, resolver, this.f30980a)) != null) {
                for (final LoadReference reference : m16856b) {
                    TicketImpl ticketImpl = this.f30983d;
                    Objects.requireNonNull(ticketImpl);
                    Intrinsics.m32179h(reference, "reference");
                    ticketImpl.f30985a.add(new PreloadReference() { // from class: com.yandex.div.core.DivPreloader$TicketImpl$toPreloadReference$1
                        @Override // com.yandex.div.core.DivPreloader.PreloadReference
                        public void cancel() {
                            LoadReference.this.cancel();
                        }
                    });
                }
            }
            DivExtensionController divExtensionController = DivPreloader.this.f30973c;
            DivBase div = data.m17557a();
            Objects.requireNonNull(divExtensionController);
            Intrinsics.m32179h(div, "div");
            if (divExtensionController.m16693c(div)) {
                for (DivExtensionHandler divExtensionHandler : divExtensionController.f31269a) {
                    if (divExtensionHandler.matches(div)) {
                        divExtensionHandler.preprocess(div, resolver);
                    }
                }
            }
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/DivPreloader$Ticket;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface Ticket {
        void cancel();
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/DivPreloader$TicketImpl;", "Lcom/yandex/div/core/DivPreloader$Ticket;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class TicketImpl implements Ticket {

        /* renamed from: a */
        @NotNull
        public final List<PreloadReference> f30985a = new ArrayList();

        @Override // com.yandex.div.core.DivPreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.f30985a.iterator();
            while (it.hasNext()) {
                ((PreloadReference) it.next()).cancel();
            }
        }
    }

    public DivPreloader(@Nullable DivImagePreloader divImagePreloader, @Nullable DivCustomViewAdapter divCustomViewAdapter, @NotNull DivExtensionController extensionController) {
        Intrinsics.m32179h(extensionController, "extensionController");
        this.f30971a = divImagePreloader;
        this.f30972b = divCustomViewAdapter;
        this.f30973c = extensionController;
    }

    @NotNull
    /* renamed from: a */
    public Ticket m16588a(@NotNull Div div, @NotNull ExpressionResolver resolver, @NotNull Callback callback) {
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(callback, "callback");
        DownloadCallback downloadCallback = new DownloadCallback(callback);
        PreloadVisitor preloadVisitor = new PreloadVisitor(downloadCallback, callback, resolver);
        preloadVisitor.m17303m(div, preloadVisitor.f30982c);
        TicketImpl ticketImpl = preloadVisitor.f30983d;
        downloadCallback.f30977d.set(true);
        if (downloadCallback.f30975b.get() == 0) {
            downloadCallback.f30974a.mo16589g(downloadCallback.f30976c.get() != 0);
        }
        return ticketImpl;
    }
}
