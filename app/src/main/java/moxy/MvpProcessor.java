package moxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import moxy.locators.PresenterBinderLocator;
import moxy.presenter.PresenterField;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class MvpProcessor {
    public static final String PRESENTER_BINDER_INNER_SUFFIX = "Binder";
    public static final String PRESENTER_BINDER_SUFFIX = "$$PresentersBinder";
    public static final String VIEW_STATE_PROVIDER_SUFFIX = "$$ViewStateProvider";
    public static final String VIEW_STATE_SUFFIX = "$$State";

    private <Delegated> List<PresenterField<? super Delegated>> combinePresenterFields(PresenterBinder<Delegated> presenterBinder, Set<PresenterField<? super Delegated>> set) {
        ArrayList arrayList = new ArrayList();
        if (presenterBinder != null) {
            arrayList.addAll(presenterBinder.getPresenterFields());
        }
        arrayList.addAll(set);
        return arrayList;
    }

    private <Delegated> MvpPresenter<? super Delegated> getMvpPresenter(Delegated delegated, PresenterField<Delegated> presenterField, String str) {
        Class<? extends MvpPresenter> presenterClass = presenterField.getPresenterClass();
        PresenterStore presenterStore = MvpFacade.getInstance().getPresenterStore();
        StringBuilder m27x = C0000a.m27x(str, "$");
        m27x.append(presenterField.getTag(delegated));
        String sb = m27x.toString();
        MvpPresenter<? super Delegated> mvpPresenter = presenterStore.get(sb);
        if (mvpPresenter != null) {
            return mvpPresenter;
        }
        MvpPresenter<? super Delegated> mvpPresenter2 = (MvpPresenter<? super Delegated>) presenterField.providePresenter(delegated);
        if (mvpPresenter2 == null) {
            return null;
        }
        mvpPresenter2.setTag(sb);
        mvpPresenter2.setPresenterClass(presenterClass);
        presenterStore.add(sb, mvpPresenter2);
        return mvpPresenter2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <Delegated> List<MvpPresenter<? super Delegated>> getMvpPresenters(Delegated delegated, String str, Set<PresenterField<? super Delegated>> set) {
        List<PresenterField<? super Delegated>> combinePresenterFields = combinePresenterFields(PresenterBinderLocator.getPresenterBinders(delegated.getClass()), set);
        if (combinePresenterFields.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        PresentersCounter presentersCounter = MvpFacade.getInstance().getPresentersCounter();
        for (PresenterField<? super Delegated> presenterField : combinePresenterFields) {
            MvpPresenter<? super Delegated> mvpPresenter = getMvpPresenter(delegated, presenterField, str);
            if (mvpPresenter != null) {
                presentersCounter.injectPresenter(mvpPresenter, str);
                arrayList.add(mvpPresenter);
                presenterField.bind(delegated, mvpPresenter);
            }
        }
        return arrayList;
    }
}
