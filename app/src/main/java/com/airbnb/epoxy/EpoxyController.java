package com.airbnb.epoxy;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.AsyncEpoxyDiffer;
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class EpoxyController implements ModelCollector, StickyHeaderCallbacks {
    private static final int DELAY_TO_CHECK_ADAPTER_COUNT_MS = 3000;
    private static final Timer NO_OP_TIMER = new NoOpTimer();
    public static Handler defaultDiffingHandler;
    public static Handler defaultModelBuildingHandler;
    private static boolean filterDuplicatesDefault;
    private static boolean globalDebugLoggingEnabled;
    private static ExceptionHandler globalExceptionHandler;
    private final EpoxyControllerAdapter adapter;
    private final Runnable buildModelsRunnable;
    private EpoxyDiffLogger debugObserver;
    private volatile boolean filterDuplicates;
    private volatile boolean hasBuiltModelsEver;
    private final ControllerHelper helper;
    private final List<Interceptor> interceptors;
    private final Handler modelBuildHandler;
    private List<ModelInterceptorCallback> modelInterceptorCallbacks;
    private ControllerModelList modelsBeingBuilt;
    private int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    private EpoxyModel<?> stagedModel;
    private volatile Thread threadBuildingModels;
    private Timer timer;

    public interface ExceptionHandler {
        /* renamed from: a */
        void mo4513a(@NonNull EpoxyController epoxyController, @NonNull RuntimeException runtimeException);
    }

    public interface Interceptor {
        /* renamed from: a */
        void m4514a(@NonNull List<EpoxyModel<?>> list);
    }

    public interface ModelInterceptorCallback {
        /* renamed from: a */
        void mo4515a(EpoxyController epoxyController);

        /* renamed from: b */
        void mo4516b(EpoxyController epoxyController);
    }

    static {
        Handler handler = MainThreadExecutor.f7001c.f6998b;
        defaultModelBuildingHandler = handler;
        defaultDiffingHandler = handler;
        filterDuplicatesDefault = false;
        globalDebugLoggingEnabled = false;
        globalExceptionHandler = new ExceptionHandler() { // from class: com.airbnb.epoxy.EpoxyController.2
            @Override // com.airbnb.epoxy.EpoxyController.ExceptionHandler
            /* renamed from: a */
            public void mo4513a(@NonNull EpoxyController epoxyController, @NonNull RuntimeException runtimeException) {
            }
        };
    }

    public EpoxyController() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterDuplicatesIfNeeded(List<EpoxyModel<?>> list) {
        if (this.filterDuplicates) {
            this.timer.mo4511a("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator<EpoxyModel<?>> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                EpoxyModel<?> next = listIterator.next();
                if (!hashSet.add(Long.valueOf(next.f6925b))) {
                    int previousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int findPositionOfDuplicate = findPositionOfDuplicate(list, next);
                    EpoxyModel<?> epoxyModel = list.get(findPositionOfDuplicate);
                    if (previousIndex <= findPositionOfDuplicate) {
                        findPositionOfDuplicate++;
                    }
                    onExceptionSwallowed(new IllegalEpoxyUsage("Two models have the same ID. ID's must be unique!\nOriginal has position " + findPositionOfDuplicate + ":\n" + epoxyModel + "\nDuplicate has position " + previousIndex + ":\n" + next));
                }
            }
            this.timer.stop();
        }
    }

    private int findPositionOfDuplicate(List<EpoxyModel<?>> list, EpoxyModel<?> epoxyModel) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).f6925b == epoxyModel.f6925b) {
                return i2;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpectedModelCount() {
        int i2 = this.adapter.f6911j;
        if (i2 != 0) {
            return i2;
        }
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<ModelInterceptorCallback> list = this.modelInterceptorCallbacks;
            if (list != null) {
                Iterator<ModelInterceptorCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo4515a(this);
                }
            }
            this.timer.mo4511a("Interceptors executed");
            Iterator<Interceptor> it2 = this.interceptors.iterator();
            while (it2.hasNext()) {
                it2.next().m4514a(this.modelsBeingBuilt);
            }
            this.timer.stop();
            List<ModelInterceptorCallback> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                Iterator<ModelInterceptorCallback> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().mo4516b(this);
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public static void setGlobalDebugLoggingEnabled(boolean z) {
        globalDebugLoggingEnabled = z;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z) {
        filterDuplicatesDefault = z;
    }

    public static void setGlobalExceptionHandler(@NonNull ExceptionHandler exceptionHandler) {
        globalExceptionHandler = exceptionHandler;
    }

    @Override // com.airbnb.epoxy.ModelCollector
    public void add(@NonNull EpoxyModel<?> epoxyModel) {
        epoxyModel.mo4495X1(this);
    }

    public void addAfterInterceptorCallback(ModelInterceptorCallback modelInterceptorCallback) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(modelInterceptorCallback);
    }

    public void addCurrentlyStagedModelIfExists() {
        EpoxyModel<?> epoxyModel = this.stagedModel;
        if (epoxyModel != null) {
            epoxyModel.mo4495X1(this);
        }
        this.stagedModel = null;
    }

    public void addInterceptor(@NonNull Interceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void addInternal(EpoxyModel<?> epoxyModel) {
        assertIsBuildingModels();
        if (epoxyModel.f6931h) {
            throw new IllegalEpoxyUsage("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        }
        if (!epoxyModel.f6926c) {
            throw new IllegalEpoxyUsage("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
        clearModelFromStaging(epoxyModel);
        epoxyModel.f6928e = null;
        this.modelsBeingBuilt.m4614L(epoxyModel);
    }

    public void addModelBuildListener(OnModelBuildFinishedListener onModelBuildFinishedListener) {
        this.adapter.f6912k.add(onModelBuildFinishedListener);
    }

    public abstract void buildModels();

    public synchronized void cancelPendingModelBuild() {
        if (this.requestedModelBuildType != 0) {
            this.requestedModelBuildType = 0;
            this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
        }
    }

    public void clearModelFromStaging(EpoxyModel<?> epoxyModel) {
        if (this.stagedModel != epoxyModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    @NonNull
    public EpoxyControllerAdapter getAdapter() {
        return this.adapter;
    }

    public int getFirstIndexOfModelInBuildingList(EpoxyModel<?> epoxyModel) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.modelsBeingBuilt.get(i2) == epoxyModel) {
                return i2;
            }
        }
        return -1;
    }

    public int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    public int getSpanCount() {
        return this.adapter.f6863b;
    }

    @NonNull
    public GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
        return this.adapter.f6867f;
    }

    public boolean hasPendingModelBuild() {
        return (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.f6909h.f6846d.m4478a()) ? false : true;
    }

    public boolean isBuildingModels() {
        return this.threadBuildingModels == Thread.currentThread();
    }

    public boolean isDebugLoggingEnabled() {
        return this.timer != NO_OP_TIMER;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    public boolean isModelAddedMultipleTimes(EpoxyModel<?> epoxyModel) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (this.modelsBeingBuilt.get(i3) == epoxyModel) {
                i2++;
            }
        }
        return i2 > 1;
    }

    public boolean isMultiSpan() {
        return this.adapter.f6863b > 1;
    }

    public boolean isStickyHeader(int i2) {
        return false;
    }

    public void moveModel(int i2, int i3) {
        assertNotBuildingModels();
        EpoxyControllerAdapter epoxyControllerAdapter = this.adapter;
        Objects.requireNonNull(epoxyControllerAdapter);
        ArrayList arrayList = new ArrayList(epoxyControllerAdapter.f6909h.f6848f);
        arrayList.add(i3, (EpoxyModel) arrayList.remove(i2));
        epoxyControllerAdapter.f6908g.f7034a = true;
        epoxyControllerAdapter.notifyItemMoved(i2, i3);
        epoxyControllerAdapter.f6908g.f7034a = false;
        if (epoxyControllerAdapter.f6909h.m4475a(arrayList)) {
            epoxyControllerAdapter.f6910i.requestModelBuild();
        }
        requestDelayedModelBuild(500);
    }

    public void notifyModelChanged(int i2) {
        assertNotBuildingModels();
        EpoxyControllerAdapter epoxyControllerAdapter = this.adapter;
        Objects.requireNonNull(epoxyControllerAdapter);
        ArrayList arrayList = new ArrayList(epoxyControllerAdapter.f6909h.f6848f);
        epoxyControllerAdapter.f6908g.f7034a = true;
        epoxyControllerAdapter.notifyItemChanged(i2);
        epoxyControllerAdapter.f6908g.f7034a = false;
        if (epoxyControllerAdapter.f6909h.m4475a(arrayList)) {
            epoxyControllerAdapter.f6910i.requestModelBuild();
        }
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i2 = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i2;
        if (i2 > 1) {
            MainThreadExecutor.f7001c.f6998b.postDelayed(new Runnable() { // from class: com.airbnb.epoxy.EpoxyController.3
                @Override // java.lang.Runnable
                public void run() {
                    if (EpoxyController.this.recyclerViewAttachCount > 1) {
                        EpoxyController.this.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
                    }
                }
            }, 3000L);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }

    public void onExceptionSwallowed(@NonNull RuntimeException runtimeException) {
        globalExceptionHandler.mo4513a(this, runtimeException);
    }

    public void onModelBound(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel, int i2, @Nullable EpoxyModel<?> epoxyModel2) {
    }

    public void onModelUnbound(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel) {
    }

    public void onRestoreInstanceState(@Nullable Bundle bundle) {
        EpoxyControllerAdapter epoxyControllerAdapter = this.adapter;
        if (epoxyControllerAdapter.f6865d.f6869b.m1100o() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        }
        if (bundle != null) {
            ViewHolderState viewHolderState = (ViewHolderState) bundle.getParcelable("saved_state_view_holders");
            epoxyControllerAdapter.f6866e = viewHolderState;
            if (viewHolderState == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        EpoxyControllerAdapter epoxyControllerAdapter = this.adapter;
        Iterator<EpoxyViewHolder> it = epoxyControllerAdapter.f6865d.iterator();
        while (it.hasNext()) {
            epoxyControllerAdapter.f6866e.m4623q(it.next());
        }
        if (epoxyControllerAdapter.f6866e.m1100o() > 0 && !epoxyControllerAdapter.hasStableIds()) {
            throw new IllegalStateException("Must have stable ids when saving view holder state");
        }
        bundle.putParcelable("saved_state_view_holders", epoxyControllerAdapter.f6866e);
    }

    public void onViewAttachedToWindow(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel) {
    }

    public void onViewDetachedFromWindow(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel) {
    }

    public void removeInterceptor(@NonNull Interceptor interceptor) {
        this.interceptors.remove(interceptor);
    }

    public void removeModelBuildListener(OnModelBuildFinishedListener onModelBuildFinishedListener) {
        this.adapter.f6912k.remove(onModelBuildFinishedListener);
    }

    public synchronized void requestDelayedModelBuild(int i2) {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
        }
        if (this.requestedModelBuildType == 2) {
            cancelPendingModelBuild();
        } else if (this.requestedModelBuildType == 1) {
            return;
        }
        this.requestedModelBuildType = i2 != 0 ? 2 : 1;
        this.modelBuildHandler.postDelayed(this.buildModelsRunnable, i2);
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestModelBuild` from inside `buildModels`");
        }
        if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    public void setDebugLoggingEnabled(boolean z) {
        assertNotBuildingModels();
        if (z) {
            this.timer = new DebugTimer(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new EpoxyDiffLogger(getClass().getSimpleName());
            }
            this.adapter.registerAdapterDataObserver(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        EpoxyDiffLogger epoxyDiffLogger = this.debugObserver;
        if (epoxyDiffLogger != null) {
            this.adapter.unregisterAdapterDataObserver(epoxyDiffLogger);
        }
    }

    public void setFilterDuplicates(boolean z) {
        this.filterDuplicates = z;
    }

    public void setSpanCount(int i2) {
        this.adapter.f6863b = i2;
    }

    public void setStagedModel(EpoxyModel<?> epoxyModel) {
        if (epoxyModel != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = epoxyModel;
    }

    public void setupStickyHeaderView(@NotNull View view) {
    }

    public void teardownStickyHeaderView(@NotNull View view) {
    }

    public EpoxyController(Handler handler, Handler handler2) {
        ControllerHelper controllerHelper;
        this.recyclerViewAttachCount = 0;
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        Map<Class<?>, Constructor<?>> map = ControllerHelperLookup.f6887a;
        Constructor<?> m4508a = ControllerHelperLookup.m4508a(getClass());
        if (m4508a == null) {
            controllerHelper = ControllerHelperLookup.f6888b;
        } else {
            try {
                controllerHelper = (ControllerHelper) m4508a.newInstance(this);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to invoke " + m4508a, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Unable to invoke " + m4508a, e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException("Unable to get Epoxy helper class.", cause);
                }
                throw ((Error) cause);
            }
        }
        this.helper = controllerHelper;
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new Runnable() { // from class: com.airbnb.epoxy.EpoxyController.1
            @Override // java.lang.Runnable
            public void run() {
                final int i2;
                final List<? extends EpoxyModel<?>> list;
                EpoxyController.this.threadBuildingModels = Thread.currentThread();
                EpoxyController.this.cancelPendingModelBuild();
                EpoxyController.this.helper.resetAutoModels();
                EpoxyController.this.modelsBeingBuilt = new ControllerModelList(EpoxyController.this.getExpectedModelCount());
                EpoxyController.this.timer.mo4511a("Models built");
                try {
                    EpoxyController.this.buildModels();
                    EpoxyController.this.addCurrentlyStagedModelIfExists();
                    EpoxyController.this.timer.stop();
                    EpoxyController.this.runInterceptors();
                    EpoxyController epoxyController = EpoxyController.this;
                    epoxyController.filterDuplicatesIfNeeded(epoxyController.modelsBeingBuilt);
                    ControllerModelList controllerModelList = EpoxyController.this.modelsBeingBuilt;
                    controllerModelList.f7012c = ControllerModelList.f6889d;
                    if (!controllerModelList.f7011b) {
                        throw new IllegalStateException("Notifications already resumed");
                    }
                    controllerModelList.f7011b = false;
                    EpoxyController.this.timer.mo4511a("Models diffed");
                    EpoxyControllerAdapter epoxyControllerAdapter = EpoxyController.this.adapter;
                    final ControllerModelList controllerModelList2 = EpoxyController.this.modelsBeingBuilt;
                    List<? extends EpoxyModel<?>> list2 = epoxyControllerAdapter.f6909h.f6848f;
                    if (!list2.isEmpty() && list2.get(0).m4522j2()) {
                        for (int i3 = 0; i3 < list2.size(); i3++) {
                            list2.get(i3).m4529t2("The model was changed between being bound and when models were rebuilt", i3);
                        }
                    }
                    final AsyncEpoxyDiffer asyncEpoxyDiffer = epoxyControllerAdapter.f6909h;
                    synchronized (asyncEpoxyDiffer) {
                        AsyncEpoxyDiffer.GenerationTracker generationTracker = asyncEpoxyDiffer.f6846d;
                        synchronized (generationTracker) {
                            i2 = generationTracker.f6861a + 1;
                            generationTracker.f6861a = i2;
                        }
                        list = asyncEpoxyDiffer.f6847e;
                    }
                    if (controllerModelList2 == list) {
                        if (list == null) {
                            list = Collections.emptyList();
                        }
                        asyncEpoxyDiffer.m4476b(i2, controllerModelList2, new DiffResult(list, list, null));
                    } else if (controllerModelList2 == null || controllerModelList2.isEmpty()) {
                        asyncEpoxyDiffer.m4476b(i2, null, (list == null || list.isEmpty()) ? null : new DiffResult(list, Collections.EMPTY_LIST, null));
                    } else if (list == null || list.isEmpty()) {
                        asyncEpoxyDiffer.m4476b(i2, controllerModelList2, new DiffResult(Collections.EMPTY_LIST, controllerModelList2, null));
                    } else {
                        final AsyncEpoxyDiffer.DiffCallback diffCallback = new AsyncEpoxyDiffer.DiffCallback(list, controllerModelList2, asyncEpoxyDiffer.f6845c);
                        asyncEpoxyDiffer.f6843a.execute(new Runnable() { // from class: com.airbnb.epoxy.AsyncEpoxyDiffer.1

                            /* renamed from: b */
                            public final /* synthetic */ DiffCallback f6849b;

                            /* renamed from: c */
                            public final /* synthetic */ int f6850c;

                            /* renamed from: d */
                            public final /* synthetic */ List f6851d;

                            /* renamed from: e */
                            public final /* synthetic */ List f6852e;

                            public RunnableC06961(final DiffCallback diffCallback2, final int i22, final List controllerModelList22, final List list3) {
                                r2 = diffCallback2;
                                r3 = i22;
                                r4 = controllerModelList22;
                                r5 = list3;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                DiffUtil.DiffResult m3537a = DiffUtil.m3537a(r2);
                                AsyncEpoxyDiffer asyncEpoxyDiffer2 = AsyncEpoxyDiffer.this;
                                int i4 = r3;
                                List<? extends EpoxyModel<?>> list3 = r4;
                                asyncEpoxyDiffer2.m4476b(i4, list3, new DiffResult(r5, list3, m3537a));
                            }
                        });
                    }
                    EpoxyController.this.timer.stop();
                    EpoxyController.this.modelsBeingBuilt = null;
                    EpoxyController.this.hasBuiltModelsEver = true;
                    EpoxyController.this.threadBuildingModels = null;
                } catch (Throwable th) {
                    EpoxyController.this.timer.stop();
                    EpoxyController.this.modelsBeingBuilt = null;
                    EpoxyController.this.hasBuiltModelsEver = true;
                    EpoxyController.this.threadBuildingModels = null;
                    EpoxyController.this.stagedModel = null;
                    throw th;
                }
            }
        };
        this.adapter = new EpoxyControllerAdapter(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    public void add(@NonNull EpoxyModel<?>... epoxyModelArr) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(controllerModelList.size() + epoxyModelArr.length);
        for (EpoxyModel<?> epoxyModel : epoxyModelArr) {
            add(epoxyModel);
        }
    }

    public void add(@NonNull List<? extends EpoxyModel<?>> list) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(list.size() + controllerModelList.size());
        Iterator<? extends EpoxyModel<?>> it = list.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}
