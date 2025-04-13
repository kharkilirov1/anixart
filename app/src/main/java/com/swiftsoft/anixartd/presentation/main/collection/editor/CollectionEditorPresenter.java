package com.swiftsoft.anixartd.presentation.main.collection.editor;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.collection.CreateEditCollectionRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.collection.CollectionResponse;
import com.swiftsoft.anixartd.network.response.collection.CreateEditCollectionResponse;
import com.swiftsoft.anixartd.network.response.collection.EditImageCollectionResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionEditorUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.create.CollectionEditorUiLogic;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnCollectionRules;
import com.swiftsoft.anixartd.utils.OnFetchCollection;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionEditorPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/editor/CollectionEditorPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/collection/editor/CollectionEditorView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionEditorPresenter extends MvpPresenter<CollectionEditorView> {

    /* renamed from: a */
    @NotNull
    public CollectionRepository f26180a;

    /* renamed from: b */
    @NotNull
    public CollectionEditorUiLogic f26181b;

    /* renamed from: c */
    @NotNull
    public CollectionEditorUiController f26182c;

    /* renamed from: d */
    @NotNull
    public Listener f26183d;

    /* compiled from: CollectionEditorPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/editor/CollectionEditorPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionEditorUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionEditorUiController.Listener {
    }

    @Inject
    public CollectionEditorPresenter(@NotNull CollectionRepository collectionRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(collectionRepository, "collectionRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26180a = collectionRepository;
        this.f26181b = new CollectionEditorUiLogic();
        this.f26182c = new CollectionEditorUiController();
        this.f26183d = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel.Listener
            /* renamed from: a */
            public void mo14497a(@NotNull String title) {
                Intrinsics.m32179h(title, "title");
                CollectionEditorUiLogic collectionEditorUiLogic = CollectionEditorPresenter.this.f26181b;
                Objects.requireNonNull(collectionEditorUiLogic);
                collectionEditorUiLogic.f29005d = title;
                CollectionEditorPresenter.this.m14495a();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionReleaseEditableModel.Listener
            /* renamed from: b */
            public void mo14498b(long j2) {
                Object obj;
                Iterator<T> it = CollectionEditorPresenter.this.f26181b.f29008g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj;
                if (release != null) {
                    CollectionEditorPresenter collectionEditorPresenter = CollectionEditorPresenter.this;
                    Objects.requireNonNull(collectionEditorPresenter);
                    CollectionEditorUiLogic collectionEditorUiLogic = collectionEditorPresenter.f26181b;
                    if (collectionEditorUiLogic.f28956a) {
                        Iterator<Release> it2 = collectionEditorUiLogic.f29008g.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i2 = -1;
                                break;
                            } else {
                                if (it2.next().getId() == release.getId()) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        if (i2 >= 0) {
                            collectionEditorUiLogic.f29008g.remove(i2);
                            collectionEditorUiLogic.f29009h--;
                        }
                        collectionEditorPresenter.m14495a();
                    }
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel.Listener
            /* renamed from: c */
            public void mo14499c(boolean z) {
                CollectionEditorPresenter collectionEditorPresenter = CollectionEditorPresenter.this;
                collectionEditorPresenter.f26181b.f29007f = z;
                collectionEditorPresenter.m14495a();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel.Listener
            /* renamed from: d */
            public void mo14500d(@NotNull String description) {
                Intrinsics.m32179h(description, "description");
                CollectionEditorUiLogic collectionEditorUiLogic = CollectionEditorPresenter.this.f26181b;
                Objects.requireNonNull(collectionEditorUiLogic);
                collectionEditorUiLogic.f29006e = description;
                CollectionEditorPresenter.this.m14495a();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel.Listener
            /* renamed from: e */
            public void mo14501e() {
                EventBusKt.m16327a(new OnCollectionRules());
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel.Listener
            /* renamed from: m0 */
            public void mo14502m0() {
                if (CollectionEditorPresenter.this.f26181b.f29008g.size() >= 100) {
                    CollectionEditorPresenter.this.getViewState().mo14505O1();
                } else {
                    CollectionEditorPresenter.this.getViewState().mo14513m0();
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.editor.CollectionEditorHeaderModel.Listener
            public void onChooseImage() {
                CollectionEditorPresenter.this.getViewState().onChooseImage();
            }
        };
    }

    /* renamed from: b */
    public static void m14494b(final CollectionEditorPresenter collectionEditorPresenter, final boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = collectionEditorPresenter.f26182c.isEmpty() && collectionEditorPresenter.f26181b.f29004c == null;
        }
        Long l2 = collectionEditorPresenter.f26181b.f29003b;
        if (l2 != null) {
            long longValue = l2.longValue();
            Observable<CollectionResponse> m15284a = collectionEditorPresenter.f26180a.m15284a(longValue);
            CollectionRepository collectionRepository = collectionEditorPresenter.f26180a;
            Observables.f62894a.m31860a(m15284a, collectionRepository.f27337b.releases(longValue, collectionRepository.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a())).m31367i(new C2565b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter$onCollection$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    if (z) {
                        collectionEditorPresenter.getViewState().mo14510b();
                    }
                    return Unit.f63088a;
                }
            }, 4)).m31368j(new Action() { // from class: com.swiftsoft.anixartd.presentation.main.collection.editor.a
                @Override // io.reactivex.functions.Action
                public final void run() {
                    CollectionEditorPresenter this$0 = CollectionEditorPresenter.this;
                    Intrinsics.m32179h(this$0, "this$0");
                    this$0.getViewState().mo14509a();
                }
            }).m31370l(new C2565b(new Function1<Pair<? extends CollectionResponse, ? extends PageableResponse<Release>>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter$onCollection$3
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Pair<? extends CollectionResponse, ? extends PageableResponse<Release>> pair) {
                    Pair<? extends CollectionResponse, ? extends PageableResponse<Release>> pair2 = pair;
                    CollectionResponse collectionResponse = (CollectionResponse) pair2.f63055b;
                    PageableResponse pageableResponse = (PageableResponse) pair2.f63056c;
                    if (collectionResponse.isSuccess()) {
                        Collection collection = collectionResponse.getCollection();
                        if (collection == null) {
                            CollectionEditorPresenter.this.getViewState().mo14512c();
                        } else {
                            CollectionEditorUiLogic collectionEditorUiLogic = CollectionEditorPresenter.this.f26181b;
                            collectionEditorUiLogic.f29004c = collection;
                            String title = collection.getTitle();
                            Intrinsics.m32179h(title, "<set-?>");
                            collectionEditorUiLogic.f29005d = title;
                            String description = collection.getDescription();
                            Intrinsics.m32179h(description, "<set-?>");
                            collectionEditorUiLogic.f29006e = description;
                            collectionEditorUiLogic.f29007f = collection.getIsPrivate();
                            collectionEditorUiLogic.f29009h = pageableResponse.getTotalCount();
                            List releases = pageableResponse.getContent();
                            Intrinsics.m32179h(releases, "releases");
                            if (collectionEditorUiLogic.f29012k) {
                                collectionEditorUiLogic.f29008g.clear();
                            }
                            collectionEditorUiLogic.f29008g.addAll(releases);
                            collectionEditorUiLogic.f29012k = true;
                            CollectionEditorPresenter.this.m14495a();
                        }
                    } else {
                        int code = collectionResponse.getCode();
                        if (code == 2 || code == 3 || code == 4) {
                            CollectionEditorPresenter.this.getViewState().mo14512c();
                        }
                    }
                    return Unit.f63088a;
                }
            }, 5), new C2565b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter$onCollection$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    CollectionEditorPresenter.this.getViewState().mo14512c();
                    return Unit.f63088a;
                }
            }, 6), Functions.f59621b, Functions.f59622c);
        }
    }

    /* renamed from: a */
    public final void m14495a() {
        CollectionEditorUiController collectionEditorUiController = this.f26182c;
        CollectionEditorUiLogic collectionEditorUiLogic = this.f26181b;
        String str = collectionEditorUiLogic.f29005d;
        String str2 = collectionEditorUiLogic.f29006e;
        Boolean valueOf = Boolean.valueOf(collectionEditorUiLogic.f29007f);
        CollectionEditorUiLogic collectionEditorUiLogic2 = this.f26181b;
        collectionEditorUiController.setData(str, str2, valueOf, collectionEditorUiLogic2.f29004c, collectionEditorUiLogic2.f29010i, Long.valueOf(collectionEditorUiLogic2.f29009h), this.f26181b.f29008g, this.f26183d);
    }

    /* renamed from: c */
    public final void m14496c() {
        Observable<CreateEditCollectionResponse> m31369k;
        CollectionEditorUiLogic collectionEditorUiLogic = this.f26181b;
        String title = collectionEditorUiLogic.f29005d;
        String description = collectionEditorUiLogic.f29006e;
        boolean z = collectionEditorUiLogic.f29007f;
        Long l2 = collectionEditorUiLogic.f29003b;
        final boolean z2 = collectionEditorUiLogic.f29011j;
        List<Release> list = collectionEditorUiLogic.f29008g;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Release) it.next()).getId()));
        }
        Intrinsics.m32179h(title, "title");
        if (!(title.length() >= 10 && title.length() <= 60)) {
            getViewState().mo14508V0();
            return;
        }
        Intrinsics.m32179h(description, "description");
        if (!(description.length() <= 1000)) {
            getViewState().mo14503E1();
            return;
        }
        if (arrayList.isEmpty()) {
            getViewState().mo14504I2();
            return;
        }
        if (arrayList.size() > 100) {
            getViewState().mo14505O1();
            return;
        }
        if (l2 == null || !z2) {
            CollectionRepository collectionRepository = this.f26180a;
            Objects.requireNonNull(collectionRepository);
            CreateEditCollectionRequest createEditCollectionRequest = new CreateEditCollectionRequest();
            createEditCollectionRequest.setTitle(title);
            createEditCollectionRequest.setDescription(description);
            createEditCollectionRequest.setPrivate(z);
            createEditCollectionRequest.setReleases(arrayList);
            m31369k = collectionRepository.f27337b.create(createEditCollectionRequest, collectionRepository.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else {
            CollectionRepository collectionRepository2 = this.f26180a;
            long longValue = l2.longValue();
            Objects.requireNonNull(collectionRepository2);
            CreateEditCollectionRequest createEditCollectionRequest2 = new CreateEditCollectionRequest();
            createEditCollectionRequest2.setTitle(title);
            createEditCollectionRequest2.setDescription(description);
            createEditCollectionRequest2.setPrivate(z);
            createEditCollectionRequest2.setReleases(arrayList);
            m31369k = collectionRepository2.f27337b.edit(longValue, createEditCollectionRequest2, collectionRepository2.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        }
        m31369k.m31370l(new C2565b(new Function1<CreateEditCollectionResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter$onCreateOrEditCollection$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(CreateEditCollectionResponse createEditCollectionResponse) {
                CreateEditCollectionResponse createEditCollectionResponse2 = createEditCollectionResponse;
                if (createEditCollectionResponse2.getCode() == 402) {
                    CollectionEditorPresenter.this.getViewState().mo14514o();
                } else {
                    final Collection collection = createEditCollectionResponse2.getCollection();
                    int code = createEditCollectionResponse2.getCode();
                    if (code == 2) {
                        CollectionEditorPresenter.this.getViewState().mo14508V0();
                    } else if (code == 3) {
                        CollectionEditorPresenter.this.getViewState().mo14503E1();
                    } else if (code == 4) {
                        CollectionEditorPresenter.this.getViewState().mo14504I2();
                    } else if (code == 5) {
                        CollectionEditorPresenter.this.getViewState().mo14515v3();
                    } else if (code == 9) {
                        CollectionEditorPresenter.this.getViewState().mo14505O1();
                    } else if (createEditCollectionResponse2.isSuccess() && collection != null) {
                        CollectionEditorPresenter collectionEditorPresenter = CollectionEditorPresenter.this;
                        File file = collectionEditorPresenter.f26181b.f29010i;
                        if (file != null) {
                            CollectionRepository collectionRepository3 = collectionEditorPresenter.f26180a;
                            long id2 = collection.getId();
                            Objects.requireNonNull(collectionRepository3);
                            RequestBody.Companion companion = RequestBody.INSTANCE;
                            MediaType.Companion companion2 = MediaType.INSTANCE;
                            Observable<EditImageCollectionResponse> m31369k2 = collectionRepository3.f27337b.editImage(id2, MultipartBody.Part.INSTANCE.createFormData("image", file.getName(), companion.create(file, companion2.parse("image/*"))), companion.create("image", companion2.parse("text/plain")), collectionRepository3.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
                            C2565b c2565b = new C2565b(new Function1<EditImageCollectionResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter$onCreateOrEditCollection$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public Unit invoke(EditImageCollectionResponse editImageCollectionResponse) {
                                    EditImageCollectionResponse editImageCollectionResponse2 = editImageCollectionResponse;
                                    if (editImageCollectionResponse2.isSuccess()) {
                                        Collection collection2 = Collection.this;
                                        String url = editImageCollectionResponse2.getUrl();
                                        if (url == null) {
                                            url = "";
                                        }
                                        collection2.setImage(url);
                                        EventBusKt.m16327a(new OnFetchCollection(collection2));
                                    }
                                    return Unit.f63088a;
                                }
                            }, 0);
                            final CollectionEditorPresenter collectionEditorPresenter2 = CollectionEditorPresenter.this;
                            m31369k2.m31370l(c2565b, new C2565b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter$onCreateOrEditCollection$1.2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public Unit invoke(Throwable th) {
                                    th.printStackTrace();
                                    CollectionEditorPresenter.this.getViewState().mo14507U2();
                                    return Unit.f63088a;
                                }
                            }, 1), Functions.f59621b, Functions.f59622c);
                        }
                        EventBusKt.m16327a(new OnFetchCollection(collection));
                        if (z2) {
                            CollectionEditorPresenter.this.getViewState().mo14506O3();
                        } else {
                            CollectionEditorPresenter.this.getViewState().mo14511b2();
                        }
                    }
                }
                return Unit.f63088a;
            }
        }, 2), new C2565b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter$onCreateOrEditCollection$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                CollectionEditorPresenter.this.getViewState().mo14512c();
                return Unit.f63088a;
            }
        }, 3), Functions.f59621b, Functions.f59622c);
    }
}
