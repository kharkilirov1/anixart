package com.yandex.div.core.view2;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivImagePreloader.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader;", "", "Callback", "PreloadVisitor", "Ticket", "TicketImpl", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivImagePreloader {

    /* renamed from: a */
    @NotNull
    public final DivImageLoader f31646a;

    /* compiled from: DivImagePreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader$Callback;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface Callback {
    }

    /* compiled from: DivImagePreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivVisitor;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class PreloadVisitor extends DivVisitor<Unit> {

        /* renamed from: a */
        @NotNull
        public final DivPreloader.DownloadCallback f31647a;

        /* renamed from: b */
        @NotNull
        public final ExpressionResolver f31648b;

        /* renamed from: c */
        public final boolean f31649c;

        /* renamed from: d */
        @NotNull
        public final ArrayList<LoadReference> f31650d = new ArrayList<>();

        public PreloadVisitor(@NotNull DivPreloader.DownloadCallback downloadCallback, @NotNull ExpressionResolver expressionResolver, boolean z) {
            this.f31647a = downloadCallback;
            this.f31648b = expressionResolver;
            this.f31649c = z;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Unit mo16593a(Div div, ExpressionResolver expressionResolver) {
            m16860n(div, expressionResolver);
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: b */
        public Unit mo16594b(Div.Container container, ExpressionResolver expressionResolver) {
            m16860n(container, expressionResolver);
            if (this.f31649c) {
                Iterator<T> it = container.f34421c.f34953t.iterator();
                while (it.hasNext()) {
                    m17303m((Div) it.next(), expressionResolver);
                }
            }
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: d */
        public Unit mo16596d(Div.Gallery gallery, ExpressionResolver expressionResolver) {
            m16860n(gallery, expressionResolver);
            if (this.f31649c) {
                Iterator<T> it = gallery.f34423c.f35956r.iterator();
                while (it.hasNext()) {
                    m17303m((Div) it.next(), expressionResolver);
                }
            }
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: e */
        public Unit mo16857e(Div.GifImage gifImage, ExpressionResolver expressionResolver) {
            m16860n(gifImage, expressionResolver);
            if (gifImage.f34424c.f36234y.mo17535b(expressionResolver).booleanValue()) {
                DivImagePreloader divImagePreloader = DivImagePreloader.this;
                String uri = gifImage.f34424c.f36227r.mo17535b(expressionResolver).toString();
                Intrinsics.m32178g(uri, "data.value.gifUrl.evaluate(resolver).toString()");
                DivPreloader.DownloadCallback downloadCallback = this.f31647a;
                this.f31650d.add(divImagePreloader.f31646a.loadImageBytes(uri, downloadCallback, -1));
                downloadCallback.f30975b.incrementAndGet();
            }
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: f */
        public Unit mo16597f(Div.Grid grid, ExpressionResolver expressionResolver) {
            m16860n(grid, expressionResolver);
            if (this.f31649c) {
                Iterator<T> it = grid.f34425c.f36481t.iterator();
                while (it.hasNext()) {
                    m17303m((Div) it.next(), expressionResolver);
                }
            }
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: g */
        public Unit mo16858g(Div.Image image, ExpressionResolver expressionResolver) {
            m16860n(image, expressionResolver);
            if (image.f34426c.f36697B.mo17535b(expressionResolver).booleanValue()) {
                DivImagePreloader divImagePreloader = DivImagePreloader.this;
                String uri = image.f34426c.f36736w.mo17535b(expressionResolver).toString();
                Intrinsics.m32178g(uri, "data.value.imageUrl.evaluate(resolver).toString()");
                DivImagePreloader.m16855a(divImagePreloader, uri, this.f31647a, this.f31650d);
            }
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: h */
        public Unit mo16598h(Div.Pager pager, ExpressionResolver expressionResolver) {
            m16860n(pager, expressionResolver);
            if (this.f31649c) {
                Iterator<T> it = pager.f34429c.f37799o.iterator();
                while (it.hasNext()) {
                    m17303m((Div) it.next(), expressionResolver);
                }
            }
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: j */
        public Unit mo16599j(Div.State state, ExpressionResolver expressionResolver) {
            m16860n(state, expressionResolver);
            if (this.f31649c) {
                Iterator<T> it = state.f34433c.f39242s.iterator();
                while (it.hasNext()) {
                    Div div = ((DivState.State) it.next()).f39259c;
                    if (div != null) {
                        m17303m(div, expressionResolver);
                    }
                }
            }
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: k */
        public Unit mo16600k(Div.Tabs tabs, ExpressionResolver expressionResolver) {
            m16860n(tabs, expressionResolver);
            if (this.f31649c) {
                Iterator<T> it = tabs.f34434c.f39522o.iterator();
                while (it.hasNext()) {
                    m17303m(((DivTabs.Item) it.next()).f39540a, expressionResolver);
                }
            }
            return Unit.f63088a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        /* renamed from: l */
        public Unit mo16859l(Div.Text text, ExpressionResolver expressionResolver) {
            m16860n(text, expressionResolver);
            List<DivText.Image> list = text.f34435c.f39985x;
            if (list != null) {
                DivImagePreloader divImagePreloader = DivImagePreloader.this;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String uri = ((DivText.Image) it.next()).f40017e.mo17535b(expressionResolver).toString();
                    Intrinsics.m32178g(uri, "it.url.evaluate(resolver).toString()");
                    DivImagePreloader.m16855a(divImagePreloader, uri, this.f31647a, this.f31650d);
                }
            }
            return Unit.f63088a;
        }

        /* renamed from: n */
        public void m16860n(@NotNull Div data, @NotNull ExpressionResolver resolver) {
            Intrinsics.m32179h(data, "data");
            Intrinsics.m32179h(resolver, "resolver");
            List<DivBackground> mo17570d = data.m17557a().mo17570d();
            if (mo17570d == null) {
                return;
            }
            DivImagePreloader divImagePreloader = DivImagePreloader.this;
            for (DivBackground divBackground : mo17570d) {
                if (divBackground instanceof DivBackground.Image) {
                    DivBackground.Image image = (DivBackground.Image) divBackground;
                    if (image.f34753c.f36764f.mo17535b(resolver).booleanValue()) {
                        String uri = image.f34753c.f36763e.mo17535b(resolver).toString();
                        Intrinsics.m32178g(uri, "background.value.imageUr…uate(resolver).toString()");
                        DivImagePreloader.m16855a(divImagePreloader, uri, this.f31647a, this.f31650d);
                    }
                }
            }
        }
    }

    /* compiled from: DivImagePreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader$Ticket;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface Ticket {
    }

    /* compiled from: DivImagePreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader$TicketImpl;", "Lcom/yandex/div/core/view2/DivImagePreloader$Ticket;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class TicketImpl implements Ticket {
        public TicketImpl() {
            new ArrayList();
        }
    }

    @Inject
    public DivImagePreloader(@NotNull DivImageLoader imageLoader) {
        Intrinsics.m32179h(imageLoader, "imageLoader");
        this.f31646a = imageLoader;
    }

    /* renamed from: a */
    public static final void m16855a(DivImagePreloader divImagePreloader, String str, DivPreloader.DownloadCallback downloadCallback, ArrayList arrayList) {
        arrayList.add(divImagePreloader.f31646a.loadImage(str, downloadCallback, -1));
        downloadCallback.f30975b.incrementAndGet();
    }

    @NotNull
    /* renamed from: b */
    public List<LoadReference> m16856b(@NotNull Div div, @NotNull ExpressionResolver expressionResolver, @NotNull DivPreloader.DownloadCallback callback) {
        Intrinsics.m32179h(callback, "callback");
        PreloadVisitor preloadVisitor = new PreloadVisitor(callback, expressionResolver, false);
        preloadVisitor.m17303m(div, expressionResolver);
        return preloadVisitor.f31650d;
    }
}
