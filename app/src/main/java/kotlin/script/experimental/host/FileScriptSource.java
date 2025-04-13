package kotlin.script.experimental.host;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.script.experimental.api.ExternalSourceCode;
import org.jetbrains.annotations.NotNull;

/* compiled from: scriptHostUtil.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/host/FileScriptSource;", "Lkotlin/script/experimental/api/ExternalSourceCode;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class FileScriptSource implements ExternalSourceCode {

    /* renamed from: b */
    public static final /* synthetic */ KProperty[] f66638b = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(FileScriptSource.class), "text", "getText()Ljava/lang/String;"))};

    /* renamed from: a */
    @NotNull
    public final File f66639a;
}
