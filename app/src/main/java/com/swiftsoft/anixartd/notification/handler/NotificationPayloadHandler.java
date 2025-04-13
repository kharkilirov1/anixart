package com.swiftsoft.anixartd.notification.handler;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: NotificationPayloadHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/notification/handler/NotificationPayloadHandler;", "", "Companion", "NotificationPayload", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationPayloadHandler {

    /* renamed from: a */
    @NotNull
    public static final Companion f25777a = new Companion(null);

    /* compiled from: NotificationPayloadHandler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004¨\u0006#"}, m31884d2 = {"Lcom/swiftsoft/anixartd/notification/handler/NotificationPayloadHandler$Companion;", "", "", "ACTION_OPEN_COLLECTION_COMMENT", "Ljava/lang/String;", "ACTION_OPEN_EPISODE", "ACTION_OPEN_MY_COLLECTION_COMMENT", "ACTION_OPEN_PROFILE_FRIEND", "ACTION_OPEN_RELEASE", "ACTION_OPEN_RELEASE_COMMENT", "ACTION_REPORT_PROCESS", "COMMENT_ID_VALUE", "DEEP_LINK_TYPE_COLLECTION", "DEEP_LINK_TYPE_COLLECTION_COMMENT", "DEEP_LINK_TYPE_PROFILE", "DEEP_LINK_TYPE_RELEASE", "DEEP_LINK_TYPE_RELEASE_COMMENT", "", "FRIEND_STATUS_ACCEPT", "I", "FRIEND_STATUS_REQUEST", "ID_VALUE", "NOTIFICATION_APPEARANCE_BIG_PICTURE", "NOTIFICATION_APPEARANCE_DEFAULT", "NOTIFICATION_APPEARANCE_LARGE_ICON_CIRCLE", "", "NOTIFICATION_REPORT_TYPE_COLLECTION", "J", "NOTIFICATION_REPORT_TYPE_COLLECTION_COMMENT", "NOTIFICATION_REPORT_TYPE_EPISODE", "NOTIFICATION_REPORT_TYPE_PROFILE", "NOTIFICATION_REPORT_TYPE_RELEASE", "NOTIFICATION_REPORT_TYPE_RELEASE_COMMENT", "PARENT_COMMENT_ID_VALUE", "TYPE_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:59:0x02df  */
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.swiftsoft.anixartd.notification.handler.NotificationPayloadHandler.NotificationPayload m14172a(@org.jetbrains.annotations.NotNull android.content.Context r32, @org.jetbrains.annotations.Nullable java.lang.String r33, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r34) {
            /*
                Method dump skipped, instructions count: 1398
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.notification.handler.NotificationPayloadHandler.Companion.m14172a(android.content.Context, java.lang.String, java.util.Map):com.swiftsoft.anixartd.notification.handler.NotificationPayloadHandler$NotificationPayload");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: NotificationPayloadHandler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/notification/handler/NotificationPayloadHandler$NotificationPayload;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final /* data */ class NotificationPayload {

        /* renamed from: a */
        @NotNull
        public final CharSequence f25791a;

        /* renamed from: b */
        @NotNull
        public final CharSequence f25792b;

        /* renamed from: c */
        @Nullable
        public final String f25793c;

        /* renamed from: d */
        public final int f25794d;

        /* renamed from: e */
        @Nullable
        public final Function1<Intent, Unit> f25795e;

        /* JADX WARN: Multi-variable type inference failed */
        public NotificationPayload(@NotNull CharSequence title, @NotNull CharSequence text, @Nullable String str, int i2, @Nullable Function1<? super Intent, Unit> function1) {
            Intrinsics.m32179h(title, "title");
            Intrinsics.m32179h(text, "text");
            this.f25791a = title;
            this.f25792b = text;
            this.f25793c = str;
            this.f25794d = i2;
            this.f25795e = function1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationPayload)) {
                return false;
            }
            NotificationPayload notificationPayload = (NotificationPayload) obj;
            return Intrinsics.m32174c(this.f25791a, notificationPayload.f25791a) && Intrinsics.m32174c(this.f25792b, notificationPayload.f25792b) && Intrinsics.m32174c(this.f25793c, notificationPayload.f25793c) && this.f25794d == notificationPayload.f25794d && Intrinsics.m32174c(this.f25795e, notificationPayload.f25795e);
        }

        public int hashCode() {
            int hashCode = (this.f25792b.hashCode() + (this.f25791a.hashCode() * 31)) * 31;
            String str = this.f25793c;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25794d) * 31;
            Function1<Intent, Unit> function1 = this.f25795e;
            return hashCode2 + (function1 != null ? function1.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("NotificationPayload(title=");
            m24u.append((Object) this.f25791a);
            m24u.append(", text=");
            m24u.append((Object) this.f25792b);
            m24u.append(", image=");
            m24u.append(this.f25793c);
            m24u.append(", appearance=");
            m24u.append(this.f25794d);
            m24u.append(", applyIntentBlock=");
            m24u.append(this.f25795e);
            m24u.append(')');
            return m24u.toString();
        }

        public /* synthetic */ NotificationPayload(CharSequence charSequence, CharSequence charSequence2, String str, int i2, Function1 function1, int i3) {
            this(charSequence, charSequence2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : function1);
        }
    }
}
