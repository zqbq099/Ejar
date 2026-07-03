# Ejar (إيجار) - Premium AI Real Estate Platform 🏰✨

*[Read in Arabic (اقرأ باللغة العربية) ⬇️](#النسخة-العربية)*

A mobile-first, luxury real estate application combining seamless user experience, fluid animations, and cutting-edge AI capabilities. Ejar redefines property hunting by integrating familiar social media patterns (like vertical feed scrolling and stories) with powerful AI tools for agents and administrators.

## 🚀 Key Features

*   **📱 Mobile-First UX:** Designed specifically for mobile screens with a full-height snap-scrolling feed, ensuring maximum immersion.
*   **🤖 AI WhatsApp Hunter:** An exclusive admin tool powered by **Google Gemini AI**. Agents can paste raw WhatsApp chat exports and upload images, and the AI automatically extracts the property title, description, price, location, phone number, and maps the corresponding photos into a ready-to-publish listing.
*   **📖 Property Stories:** A dedicated stories bar for "Golden" and premium properties, allowing users to tap through full-screen visual highlights.
*   **🌗 Royal Theme System:** A meticulously crafted design system supporting both Light and Dark modes (Navy & Gold), bringing a premium, trustworthy feel to the real estate market.
*   **🗺️ Interactive Maps:** Integrated map views to explore properties geographically with custom "Royal" markers.
*   **💎 Gamification & Mining:** Integrated reward system allowing users to "mine" coins based on their engagement and tier.

## 🛠️ Tech Stack

*   **Frontend Framework:** React 18 with Vite
*   **Language:** TypeScript
*   **Styling:** Tailwind CSS
*   **Animations:** Framer Motion (`motion/react`)
*   **Icons:** Lucide React
*   **State Management:** Zustand
*   **AI Integration:** Google Gemini API (`@google/genai`)
*   **Database & Auth:** Firebase (Firestore & Authentication)

## 📦 Getting Started

### Prerequisites
*   Node.js (v18 or higher)
*   npm or yarn
*   Firebase Project configuration
*   Google Gemini API Key

### Installation

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd ejar-app
   ```

2. **Install dependencies:**
   ```bash
   npm install
   ```

3. **Environment Variables:**
   Create a `.env` file in the root directory and add the necessary keys:
   ```env
   VITE_FIREBASE_API_KEY=your_firebase_api_key
   VITE_FIREBASE_AUTH_DOMAIN=your_firebase_auth_domain
   VITE_FIREBASE_PROJECT_ID=your_firebase_project_id
   # ... other Firebase configs

   GEMINI_API_KEY=your_gemini_api_key
   ```

4. **Run the development server:**
   ```bash
   npm run dev
   ```

---

<div dir="rtl">

# <a name="النسخة-العربية"></a> منصة "إيجار" الفاخرة - العقارات المدعومة بالذكاء الاصطناعي 🏰✨

تطبيق عقاري فاخر مصمم بأسلوب "الموبايل أولاً" (Mobile-First)، يجمع بين تجربة المستخدم السلسة، والرسوم المتحركة الانسيابية، وقدرات الذكاء الاصطناعي المتطورة. تعيد "إيجار" تعريف رحلة البحث عن العقارات من خلال دمج أنماط التصفح الشهيرة في وسائل التواصل الاجتماعي (مثل التمرير الرأسي والقصص) مع أدوات ذكاء اصطناعي قوية للوكلاء والمديرين.

## 🚀 المميزات الرئيسية

*   **📱 تجربة مستخدم مخصصة للموبايل:** تصميم يركز على الموبايل مع واجهة تمرير رأسي (Snap Scrolling) تملأ الشاشة لتوفير تجربة غامرة ومريحة.
*   **🤖 صياد الواتساب الذكي (WhatsApp Hunter):** أداة حصرية للمدراء مدعومة بـ **Google Gemini AI**. يمكن للوكلاء لصق نصوص المحادثات العشوائية من مجموعات الواتساب ورفع الصور، وسيقوم الذكاء الاصطناعي تلقائياً باستخراج اسم العقار، الوصف، السعر، الموقع، ورقم الهاتف، وربط الصور المناسبة لإنشاء إعلان جاهز للنشر فوراً.
*   **📖 قصص العقارات (Stories):** شريط قصص مخصص للإعلانات "الذهبية" والمميزة، مما يتيح للمستخدمين استعراض أبرز العقارات بملء الشاشة.
*   **🌗 نظام الثيم الملكي:** تصميم دقيق يدعم الوضعين الليلي والنهاري (كحلي وذهبي)، مما يضفي طابعاً بالفخامة والموثوقية على السوق العقاري.
*   **🗺️ الخرائط التفاعلية:** عرض الخرائط المدمج لاستكشاف العقارات جغرافياً مع علامات (Markers) ملكية مخصصة.
*   **💎 نظام المكافآت والتعدين:** نظام تفاعلي يتيح للمستخدمين "تعدين" العملات بناءً على تفاعلهم ومستواهم في التطبيق.

## 🛠️ التقنيات المستخدمة

*   **إطار العمل:** React 18 مع Vite
*   **لغة البرمجة:** TypeScript
*   **التصميم:** Tailwind CSS
*   **الرسوم المتحركة:** Framer Motion (`motion/react`)
*   **الأيقونات:** Lucide React
*   **إدارة الحالة:** Zustand
*   **الذكاء الاصطناعي:** واجهة Google Gemini API (`@google/genai`)
*   **قواعد البيانات والمصادقة:** Firebase (Firestore & Authentication)

## 📦 البدء والتشغيل

### المتطلبات الأساسية
*   Node.js (الإصدار 18 أو أحدث)
*   npm أو yarn
*   إعدادات مشروع Firebase
*   مفتاح واجهة Google Gemini API

### خطوات التثبيت

1. **تحميل المشروع:**
   ```bash
   git clone <repository-url>
   cd ejar-app
   ```

2. **تثبيت الحزم البرمجية:**
   ```bash
   npm install
   ```

3. **المتغيرات البيئية (Environment Variables):**
