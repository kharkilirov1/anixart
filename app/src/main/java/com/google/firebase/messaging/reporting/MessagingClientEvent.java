package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;

/* loaded from: classes2.dex */
public final class MessagingClientEvent {

    /* renamed from: p */
    public static final /* synthetic */ int f23405p = 0;

    /* renamed from: a */
    public final long f23406a;

    /* renamed from: b */
    public final String f23407b;

    /* renamed from: c */
    public final String f23408c;

    /* renamed from: d */
    public final MessageType f23409d;

    /* renamed from: e */
    public final SDKPlatform f23410e;

    /* renamed from: f */
    public final String f23411f;

    /* renamed from: g */
    public final String f23412g;

    /* renamed from: h */
    public final int f23413h;

    /* renamed from: i */
    public final int f23414i;

    /* renamed from: j */
    public final String f23415j;

    /* renamed from: k */
    public final long f23416k;

    /* renamed from: l */
    public final Event f23417l;

    /* renamed from: m */
    public final String f23418m;

    /* renamed from: n */
    public final long f23419n;

    /* renamed from: o */
    public final String f23420o;

    public static final class Builder {

        /* renamed from: a */
        public long f23421a = 0;

        /* renamed from: b */
        public String f23422b = "";

        /* renamed from: c */
        public String f23423c = "";

        /* renamed from: d */
        public MessageType f23424d = MessageType.UNKNOWN;

        /* renamed from: e */
        public SDKPlatform f23425e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f */
        public String f23426f = "";

        /* renamed from: g */
        public String f23427g = "";

        /* renamed from: h */
        public int f23428h = 0;

        /* renamed from: i */
        public String f23429i = "";

        /* renamed from: j */
        public Event f23430j = Event.UNKNOWN_EVENT;

        /* renamed from: k */
        public String f23431k = "";

        /* renamed from: l */
        public String f23432l = "";

        /* renamed from: a */
        public MessagingClientEvent m12714a() {
            return new MessagingClientEvent(this.f23421a, this.f23422b, this.f23423c, this.f23424d, this.f23425e, this.f23426f, this.f23427g, 0, this.f23428h, this.f23429i, 0L, this.f23430j, this.f23431k, 0L, this.f23432l);
        }
    }

    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);


        /* renamed from: b */
        public final int f23436b;

        Event(int i2) {
            this.f23436b = i2;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        /* renamed from: x */
        public int mo5543x() {
            return this.f23436b;
        }
    }

    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: b */
        public final int f23441b;

        MessageType(int i2) {
            this.f23441b = i2;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        /* renamed from: x */
        public int mo5543x() {
            return this.f23441b;
        }
    }

    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);


        /* renamed from: b */
        public final int f23445b;

        SDKPlatform(int i2) {
            this.f23445b = i2;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        /* renamed from: x */
        public int mo5543x() {
            return this.f23445b;
        }
    }

    static {
        new Builder().m12714a();
    }

    public MessagingClientEvent(long j2, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i2, int i3, String str5, long j3, Event event, String str6, long j4, String str7) {
        this.f23406a = j2;
        this.f23407b = str;
        this.f23408c = str2;
        this.f23409d = messageType;
        this.f23410e = sDKPlatform;
        this.f23411f = str3;
        this.f23412g = str4;
        this.f23413h = i2;
        this.f23414i = i3;
        this.f23415j = str5;
        this.f23416k = j3;
        this.f23417l = event;
        this.f23418m = str6;
        this.f23419n = j4;
        this.f23420o = str7;
    }
}
