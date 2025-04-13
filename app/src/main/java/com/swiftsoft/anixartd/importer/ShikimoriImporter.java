package com.swiftsoft.anixartd.importer;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.yandex.div2.C3033a;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShikimoriImporter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/importer/ShikimoriImporter;", "Lcom/swiftsoft/anixartd/importer/Importer;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ShikimoriImporter extends Importer {

    /* compiled from: ShikimoriImporter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/importer/ShikimoriImporter$Companion;", "", "", "SHIKIMORI_STATUS_COMPLETED", "Ljava/lang/String;", "SHIKIMORI_STATUS_DROPPED", "SHIKIMORI_STATUS_HOLD_ON", "SHIKIMORI_STATUS_PLANS", "SHIKIMORI_STATUS_REWATCHING", "SHIKIMORI_STATUS_WATCHING", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.importer.Importer
    /* renamed from: a */
    public void mo14166a(@NotNull Context context, @NotNull final Function1<? super Importer, Unit> function1) throws Exception {
        if (this.f25765g.isEmpty()) {
            function1.invoke(this);
            return;
        }
        String string = context.getString(C2507R.string.import_invalid_list);
        Intrinsics.m32178g(string, "context.getString(R.string.import_invalid_list)");
        String string2 = context.getString(C2507R.string.import_invalid_list_description);
        Intrinsics.m32178g(string2, "context.getString(R.stri…invalid_list_description)");
        String m17745g = C3033a.m17745g(new Object[]{context.getString(C2507R.string.list_rewatching)}, 1, string2, "format(format, *args)");
        String string3 = context.getString(C2507R.string.import_move_to_list);
        Intrinsics.m32178g(string3, "context.getString(R.string.import_move_to_list)");
        String m17745g2 = C3033a.m17745g(new Object[]{context.getString(C2507R.string.list_watching)}, 1, string3, "format(format, *args)");
        String string4 = context.getString(C2507R.string.import_move_to_list);
        Intrinsics.m32178g(string4, "context.getString(R.string.import_move_to_list)");
        String m17745g3 = C3033a.m17745g(new Object[]{context.getString(C2507R.string.list_completed)}, 1, string4, "format(format, *args)");
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
        builder.f30150b = 4;
        builder.f30151c = string;
        builder.f30152d = m17745g;
        builder.f30154f = m17745g2;
        builder.f30153e = m17745g3;
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.importer.ShikimoriImporter$processTroubles$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                ShikimoriImporter shikimoriImporter = ShikimoriImporter.this;
                shikimoriImporter.f25760b.addAll(shikimoriImporter.f25765g);
                ShikimoriImporter.this.f25765g.clear();
                function1.invoke(ShikimoriImporter.this);
                return Unit.f63088a;
            }
        });
        builder.m16313e(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.importer.ShikimoriImporter$processTroubles$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                ShikimoriImporter shikimoriImporter = ShikimoriImporter.this;
                shikimoriImporter.f25762d.addAll(shikimoriImporter.f25765g);
                ShikimoriImporter.this.f25765g.clear();
                function1.invoke(ShikimoriImporter.this);
                return Unit.f63088a;
            }
        });
        builder.f30159k = false;
        builder.m16317i();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: b */
    public void m14167b(@NotNull InputStreamReader inputStreamReader) throws Exception {
        try {
            JsonReader jsonReader = new JsonReader(inputStreamReader);
            JsonElement m12846a = JsonParser.m12846a(jsonReader);
            Objects.requireNonNull(m12846a);
            if (!(m12846a instanceof JsonNull) && jsonReader.mo12898C() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            Iterator<JsonElement> it = m12846a.m12843b().iterator();
            while (it.hasNext()) {
                JsonObject m12844d = it.next().m12844d();
                long mo12840f = m12844d.f23668a.get("target_id").mo12840f();
                String mo12841g = m12844d.f23668a.get("status").mo12841g();
                if (mo12841g != null) {
                    switch (mo12841g.hashCode()) {
                        case -1402931637:
                            if (!mo12841g.equals("completed")) {
                                break;
                            } else {
                                this.f25762d.add(Long.valueOf(mo12840f));
                                break;
                            }
                        case -1326157025:
                            if (!mo12841g.equals("on_hold")) {
                                break;
                            } else {
                                this.f25764f.add(Long.valueOf(mo12840f));
                                break;
                            }
                        case -493887036:
                            if (!mo12841g.equals("planned")) {
                                break;
                            } else {
                                this.f25761c.add(Long.valueOf(mo12840f));
                                break;
                            }
                        case 545156275:
                            if (!mo12841g.equals("watching")) {
                                break;
                            } else {
                                this.f25760b.add(Long.valueOf(mo12840f));
                                break;
                            }
                        case 1748146150:
                            if (!mo12841g.equals("rewatching")) {
                                break;
                            } else {
                                this.f25765g.add(Long.valueOf(mo12840f));
                                break;
                            }
                        case 1925736384:
                            if (!mo12841g.equals("dropped")) {
                                break;
                            } else {
                                this.f25763e.add(Long.valueOf(mo12840f));
                                break;
                            }
                    }
                }
            }
        } catch (MalformedJsonException e2) {
            throw new JsonSyntaxException(e2);
        } catch (IOException e3) {
            throw new JsonIOException(e3);
        } catch (NumberFormatException e4) {
            throw new JsonSyntaxException(e4);
        }
    }
}
