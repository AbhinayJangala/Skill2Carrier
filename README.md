<div align="center">

  # 🎓 SKILL2career (S2C)

  ### Smart Career Readiness, Opportunity Discovery & Placement Platform

  A full-stack Android and Ktor-powered career ecosystem that bridges students and campus placement cells with AI-driven resume evaluations, skills gap benchmarking, automated opportunity harvesting, and complete application lifecycle management.

  <p>
    <img src="https://img.shields.io/badge/Platform-Android%20(API%2024%2B)-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android"/>
    <img src="https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin"/>
    <img src="https://img.shields.io/badge/UI-Jetpack%20Compose%20%7C%20Material%203-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white" alt="Jetpack Compose"/>
    <img src="https://img.shields.io/badge/Backend-Ktor%20%7C%20Netty-087CFA?style=for-the-badge&logo=ktor&logoColor=white" alt="Ktor Server"/>
    <img src="https://img.shields.io/badge/Database-Exposed%20ORM%20%7C%20Room-F88900?style=for-the-badge&logo=sqlite&logoColor=white" alt="Exposed & Room"/>
    <img src="https://img.shields.io/badge/AI-OpenRouter%20%2F%20GPT--4o--mini-412991?style=for-the-badge&logo=openai&logoColor=white" alt="OpenRouter AI"/>
  </p>

  <p>
    <a href="#-overview">Overview</a> •
    <a href="#-features">Features</a> •
    <a href="#-tech-stack">Tech Stack</a> •
    <a href="#-architecture">Architecture</a> •
    <a href="#-screenshots">Screenshots</a> •
    <a href="#-getting-started">Getting Started</a> •
    <a href="#-api--backend-endpoints">API Endpoints</a> •
    <a href="#-database--data-model">Data Model</a> •
    <a href="#-contributing">Contributing</a>
  </p>

</div>

---

## 📌 Overview

**SKILL2career (S2C)** is a comprehensive full-stack career readiness platform designed to empower students in navigating competitive recruitment landscapes while equipping academic institutions and placement administrators with intelligent recruitment tools.

Built as an integrated solution comprising a modern **Jetpack Compose Android application** and an asynchronous **Kotlin Ktor backend**, SKILL2career delivers an end-to-end recruitment experience: from drafting resumes and tracking academic metrics to analyzing job readiness with generative AI and tracking multi-document application workflows.

The system features robust **Multi-Tier Role-Based Access Control (RBAC)** across Students, Admins, and Super Admins, alongside an isolated database architecture and offline-first Room local persistence.

### 🎯 Project Goals

- **Bridge Skill Gaps:** Help students benchmark their abilities against real-world industry requirements using tailored AI diagnostics.
- **Empower Job Readiness:** Provide in-app PDF resume generation, document text extraction, and automated ATS-style resume auditing.
- **Automate Opportunity Discovery:** Enable administrators to source, review, and publish high-quality internships and scholarships using AI discovery agents.
- **Streamline Campus Placement Workflows:** Offer administrators centralized tooling to verify CGPA eligibility, inspect official verification documents (Aadhar, marksheets, income proof), and manage candidate statuses.
- **Deliver Modern Android Architecture:** Combine Jetpack Compose, Material 3, MVVM, Room caching, and Coroutines/Flow for a responsive user experience.

---

## ✨ Features

### 🤖 AI-Powered Career Intelligence

- **AI Resume Audit:** Upload resumes in PDF or DOCX format (or paste raw text) to receive structured AI evaluations, identifying core strengths, critical deficiencies, and recommended career trajectories.
- **Skills Gap Benchmarking:** Specify a target profession (e.g., *Full Stack Developer*, *Data Engineer*, *DevOps Specialist*) to receive a breakdown comparing present skills against industry expectations, accompanied by tailored learning resources.
- **Document Text Extraction:** Backend integration with Apache PDFBox and Apache POI to extract text from user-uploaded PDF and DOCX files.
- **AI Opportunity Discovery:** Administrators can trigger AI web discovery agents to harvest relevant internship and scholarship opportunities for administrative review and publication.

### 💼 Opportunity Catalog & Eligibility Filtering

- **Dynamic Catalog:** Browse and search curated internships, full-time jobs, and scholarship programs.
- **Interactive Filtering:** Filter listings by type (`Internship`, `Job`, `Scholarship`) and technical skill tags.
- **Automated CGPA Validation:** Enforce minimum academic thresholds to ensure students only apply to listings they qualify for.
- **Saved Bookmarks:** Save preferred opportunities to a dedicated offline-accessible bookmarks screen.

### 📝 Multi-Document Application Pipeline

- **Streamlined Submissions:** Apply directly to opportunities with custom statements of intent.
- **Credential & Verification Uploads:** Secure multipart document upload pipeline supporting resumes, family income certificates, Aadhar verification documents, and academic marksheets.
- **Real-Time Status Tracking:** Monitor application statuses (`Pending`, `Under Review`, `Shortlisted`, `Accepted`, `Rejected`) directly from the student dashboard.

### 📄 Interactive Resume Builder & Native PDF Exporter

- **Guided Step-by-Step Wizard:** Step-by-step form builder capturing contact information, educational history, professional experience, key technical projects, and skills.
- **Native PDF Document Generation:** Generates formatted PDF resumes on-device using Android's native `PdfDocument` APIs.
- **Direct Storage Export:** Exports PDF files directly to device downloads/external storage via Android MediaStore.

### 📈 CGPA & Academic Performance Tracker

- **Course & Credit Management:** Add, edit, and organize individual courses per semester with associated credit hours and grade points.
- **Automated Grade Calculations:** Real-time computation of Semester Grade Point Average (SGPA) and cumulative CGPA.
- **Visual Progress Metrics:** Interactive visual feedback displaying academic performance trajectories across semesters.

### 🛡️ Multi-Tier Administration & Governance

- **Super Admin Oversight:** Master administrative control verifying and approving/rejecting new admin account registrations.
- **Admin Dashboard:** Publish new opportunities, set eligibility criteria, inspect candidate submissions, review uploaded credentials, and update application decisions.
- **Student Management:** View and manage registered student directories, filter by academic department/branch, and maintain system integrity.
- **Approval Notification System:** Real-time administrative notifications alerting Super Admins to pending administrative requests.

### 🔐 Security & Offline Resiliency

- **Robust Authentication:** BCrypt password hashing with automatic transparent legacy hash migration and JSON Web Token (JWT) stateless authorization.
- **Domain Data Isolation:** Segregated data models ensuring distinct operational boundaries between administrative workflows and student data.
- **Local Room Database:** Local caching of user profiles, opportunities, and submitted applications for smooth offline navigation.

---

## 🛠️ Tech Stack

### Client (Android Application)

| Category | Technologies |
|---|---|
| Platform | Android (API 24+ / Android 7.0+) |
| Programming Language | Kotlin (2.0+) |
| UI Framework | Jetpack Compose |
| Design System | Material 3 (Classical Navy & Gold Palette) |
| Architecture | Model–View–ViewModel (MVVM) |
| Navigation | Navigation Compose |
| Networking | Retrofit 2 & OkHttp 3 with Logging Interceptor |
| Asynchronous Execution | Kotlin Coroutines & Flow |
| Local Database | Android Jetpack Room (with KSP) |
| Serialization | Google Gson |
| Image Loading | Coil Compose |
| PDF Document Engine | Android Native `android.graphics.pdf.PdfDocument` |
| Build Tool | Gradle (Kotlin DSL `.gradle.kts`) |

### Backend (Server)

| Category | Technologies |
|---|---|
| Runtime | Kotlin JVM (Java 17+) |
| Framework | Ktor Server (Netty Engine) |
| ORM / SQL Layer | JetBrains Exposed (Core, DAO, JDBC) |
| Database | H2 Embedded Database (File-persisted) |
| Authentication & Auth | JWT (Java-JWT) & BCrypt (`at.favre.lib:bcrypt`) |
| AI Integration | OpenRouter API (OpenAI GPT-4o-mini & configurable LLMs) |
| Document Extraction | Apache PDFBox (PDF) & Apache POI (DOCX) |
| HTTP Client | Ktor CIO Client with Content Negotiation & Kotlinx Serialization |
| Logging | Logback Classic & SLF4J |

---

## 🏗️ Architecture

SKILL2career implements a layered architecture across its mobile client and backend microservice.

### Architectural Responsibilities

| Layer | Responsibility |
|---|---|
| **Android UI (Compose)** | Renders dynamic reactive screens, handles user inputs, and supports animations and adaptive layouts. |
| **ViewModel** | Coordinates business logic, observes network/database flows, and exposes UI state to Compose components. |
| **Local Cache (Room)** | Persists user profiles, bookmarks, and applications locally for offline resilience. |
| **Network Client (Retrofit)** | Handles asynchronous HTTP REST communication, JWT bearer token attachment, and multipart uploads. |
| **Ktor Routing & Engine** | Routes client endpoints, handles JWT authentication, enforces RBAC, and manages server lifecycle. |
| **Exposed ORM & H2** | Coordinates transactional relational database persistence with strict table segregation. |
| **AI Service Engine** | Coordinates OpenRouter LLM requests for resume analysis, skill mapping, and opportunity discovery. |

### Project Structure

```text
Skill2Carrier/
├── app/                                    # Android Mobile Application
│   ├── src/main/
│   │   ├── java/com/example/skill2career/
│   │   │   ├── network/                    # Retrofit service & API contracts
│   │   │   │   ├── ApiService.kt           # REST endpoint declarations & DTOs
│   │   │   │   └── RetrofitClient.kt       # OkHttp & Retrofit client instance
│   │   │   ├── ui/theme/                   # Material 3 colors, typography, theme
│   │   │   ├── AdminScreen.kt              # Admin dashboard, approvals, AI discover
│   │   │   ├── AIResumeAnalysisScreen.kt   # AI resume feedback & skills gap screens
│   │   │   ├── cgpatracker.kt              # Semester & CGPA calculation module
│   │   │   ├── LocalDatabase.kt            # Room entities, DAOs & AppDatabase
│   │   │   ├── loginScreen.kt              # Authentication & role-based sign in
│   │   │   ├── MainActivity.kt             # Navigation host & activity entry point
│   │   │   ├── MainViewModel.kt            # Central UI state & business coordinator
│   │   │   ├── myapplication.kt            # Student application tracking screen
│   │   │   ├── opportunities.kt            # Opportunities catalog & application modal
│   │   │   ├── ProfileScreen.kt            # Student profile details
│   │   │   ├── resumebuilder.kt            # Resume form wizard & PDF export engine
│   │   │   ├── saved.kt                    # Saved opportunities & bookmarks
│   │   │   ├── signup.kt                   # Student & Admin registration flows
│   │   │   └── StudentScreen.kt            # Student home dashboard & navigation drawer
│   │   ├── res/                            # Drawable assets, layouts, mipmaps, strings
│   │   └── AndroidManifest.xml             # Permissions, file providers, activities
│   └── build.gradle.kts                    # Android dependencies & KSP plugins
│
├── server/                                 # Ktor Backend Microservice
│   ├── src/main/kotlin/com/example/skill2career/server/
│   │   ├── Application.kt                  # Ktor server routes, DB schema, JWT auth
│   │   └── OpenAIService.kt                # OpenRouter client, prompts, AI analysis
│   ├── uploads/                            # Stored applicant documents (PDF, DOCX)
│   ├── .env.example                        # Example environment configuration template
│   └── build.gradle.kts                    # Server dependencies & Ktor plugins
│
├── s2c_database.mv.db                      # Embedded H2 Database file
├── build.gradle.kts                        # Root project build script
├── settings.gradle.kts                     # Subproject module declarations
└── README.md
```

---

## 📱 Screenshots

Screenshots will be added here to showcase the user interface and key features.

| Screen | Description |
|---|---|
| **Login & Role Selector** | Dual authentication supporting Student and Admin credentials |
| **Student Dashboard** | Central navigation hub with quick stats, greeting, and access cards |
| **Opportunities Catalog** | Filterable list of internships and scholarships with CGPA criteria |
| **AI Resume Analysis** | Automated resume critique, strength breakdown, and career paths |
| **Skills Gap Analysis** | Role benchmark diagnostics and tailored educational roadmaps |
| **Resume Builder Wizard** | Multi-step form for drafting professional resumes with PDF export |
| **CGPA Tracker** | Semester course grade manager with automated SGPA/CGPA calculations |
| **Admin Management Hub** | Application review, document preview, and AI opportunity curation |

<!--
After adding screenshots to the screenshots/ directory,
replace this section with the following layout:

<div align="center">

| Login Screen | Student Dashboard |
|:---:|:---:|
| ![Login](screenshots/login.png) | ![Dashboard](screenshots/dashboard.png) |

| AI Resume Analysis | Opportunities Catalog |
|:---:|:---:|
| ![Resume Analysis](screenshots/resume-analysis.png) | ![Opportunities](screenshots/opportunities.png) |

| Resume Builder | CGPA Tracker |
|:---:|:---:|
| ![Resume Builder](screenshots/resume-builder.png) | ![CGPA Tracker](screenshots/cgpa.png) |

</div>
-->

---

## 🚀 Getting Started

Follow these steps to set up and run both the **Ktor Backend Server** and the **Android Client** locally.

### Prerequisites

- **[Android Studio](https://developer.android.com/studio)** (Ladybug or newer recommended).
- **JDK 17 or newer** (compatible with Gradle 8+ and Ktor).
- **Android Device or Emulator** running Android 7.0 (API level 24) or higher.
- **[OpenRouter API Key](https://openrouter.ai/)** (for AI Resume Analysis and Opportunity Discovery).
- **Git** installed on your development machine.

---

### 1. Clone the Repository

```bash
git clone https://github.com/AbhinayJangala/Skill2Carrier.git
cd Skill2Carrier
```

---

### 2. Configure the Backend Server

1. Navigate to the `server/` directory:
   ```bash
   cd server
   ```

2. Create a `.env` file based on `.env.example`:
   ```bash
   cp .env.example .env
   ```

3. Populate your `.env` configuration file:
   ```env
   # OpenRouter API Key for AI operations
   OPENROUTER_API_KEY=your_actual_openrouter_api_key_here

   # Base URL (default is OpenRouter v1)
   OPENROUTER_BASE_URL=https://openrouter.ai/api/v1

   # Configurable Models
   OPENROUTER_MODEL_RESUME_ANALYSIS=openai/gpt-4o-mini
   OPENROUTER_MODEL_SKILL_EXTRACTION=openai/gpt-4o-mini
   OPENROUTER_MODEL_CAREER_SUGGESTIONS=openai/gpt-4o-mini
   OPENROUTER_MODEL_OPPORTUNITY_SEARCH=openai/gpt-4o-mini
   ```

---

### 3. Start the Ktor Backend

Run the backend server using the Gradle wrapper from the project root:

**Windows (PowerShell / Command Prompt):**
```powershell
.\gradlew.bat :server:run
```

**Linux / macOS:**
```bash
./gradlew :server:run
```

Once initialized, the server will output:
```text
🚀 Server running at http://0.0.0.0:8080
📁 Serving uploads from: .../server/uploads
✅ OpenRouter API key loaded successfully
```

---

### 4. Configure the Android Client

Before building the app, configure the network client to point to your running server:

1. Open `app/src/main/java/com/example/skill2career/network/RetrofitClient.kt`.
2. Update the `BASE_URL`:
   - **When using the Android Emulator:**
     ```kotlin
     private const val BASE_URL = "http://10.0.2.2:8080/"
     ```
   - **When using a Physical Device:**
     Ensure your computer and Android device are on the same Wi-Fi network. Find your host machine's local IPv4 address (via `ipconfig` on Windows or `ifconfig` on macOS/Linux):
     ```kotlin
     private const val BASE_URL = "http://192.168.X.X:8080/"
     ```

---

### 5. Build and Launch the Android Application

**Using Gradle CLI:**

- **Windows:**
  ```powershell
  .\gradlew.bat assembleDebug
  ```
- **Linux / macOS:**
  ```bash
  ./gradlew assembleDebug
  ```

**Using Android Studio:**
1. Open the project in Android Studio.
2. Allow Gradle sync to complete.
3. Select your target physical device or emulator.
4. Click **Run ▶** (`Shift + F10`).

---

### 6. Default Roles & Onboarding

- **Student Access:** Register an account via the Sign Up screen selecting the **Student** role. You will immediately have access to the student dashboard, opportunities, AI resume analysis, and CGPA tools.
- **Admin Access:** Register an account selecting the **Admin** role. New admin requests are submitted to the Super Admin queue for approval.
- **Super Admin Credentials:** The Super Admin account manages system governance and verifies pending admin applications.
  - *Default Email:* `ra@gm.com`
  - *Default Password:* `Rahul@2006` *(Note: Update credentials in production deployments)*

---

## 🔌 API & Backend Endpoints

The Ktor microservice exposes the following REST endpoints:

### Authentication & Authorization
| Method | Endpoint | Description | Role Required |
|---|---|---|---|
| `POST` | `/login` | Authenticate user and issue JWT bearer token | Public |
| `POST` | `/signup` | Register a new Student or submit Admin request | Public |
| `POST` | `/admin/login-email` | Step 1 of Admin two-factor email verification | Admin / Super Admin |
| `POST` | `/admin/login-password` | Step 2 of Admin credential verification | Admin / Super Admin |
| `POST` | `/forgot-password` | Request password reset token | Public |
| `POST` | `/reset-password` | Set new password via token | Public |

### Opportunities & Applications
| Method | Endpoint | Description | Role Required |
|---|---|---|---|
| `GET` | `/opportunities` | Fetch opportunities list (with role isolation) | Authenticated |
| `POST` | `/opportunities` | Create and publish a new opportunity | Admin / Super Admin |
| `POST` | `/apply` | Submit student application with attached files | Student |
| `GET` | `/applications/{email}` | Retrieve applications submitted by student | Student / Admin |
| `GET` | `/applications/all` | Retrieve all applications for admin review | Admin / Super Admin |
| `PUT` | `/applications/{id}/status` | Update application status (`Accepted`, etc.) | Admin / Super Admin |

### AI Career Engine
| Method | Endpoint | Description | Role Required |
|---|---|---|---|
| `POST` | `/ai/analyze-resume` | Perform full AI resume analysis and career suggestions | Authenticated |
| `POST` | `/ai/skills-gap` | Benchmark current skillset against target role | Authenticated |
| `POST` | `/extract-text` | Extract raw text from PDF and DOCX uploads | Authenticated |
| `POST` | `/admin/fetch-opportunities` | Trigger AI discovery of web opportunities | Admin / Super Admin |
| `GET` | `/admin/ai/opportunities/pending` | List pending AI-discovered opportunities | Admin / Super Admin |
| `POST` | `/admin/ai/opportunities/{id}/approve` | Approve and publish discovered opportunity | Admin / Super Admin |
| `POST` | `/admin/ai/opportunities/{id}/reject` | Reject discovered opportunity | Admin / Super Admin |

### Super Admin Governance
| Method | Endpoint | Description | Role Required |
|---|---|---|---|
| `GET` | `/superadmin/pending-requests` | View pending admin account registration requests | Super Admin |
| `POST` | `/superadmin/approve-request` | Approve pending admin registration | Super Admin |
| `POST` | `/superadmin/reject-request` | Reject pending admin registration | Super Admin |
| `GET` | `/superadmin/notifications` | View system and registration notifications | Super Admin |

### Document Storage
| Method | Endpoint | Description | Role Required |
|---|---|---|---|
| `POST` | `/upload` | Multipart file upload (resumes, Aadhar, marksheets) | Authenticated |
| `GET` | `/uploads/{name}` | Download and stream stored documents | Authenticated |

---

## 🔑 Permissions

The Android application requests the following permissions in `AndroidManifest.xml`:

| Permission | Purpose |
|---|---|
| `android.permission.INTERNET` | Communicates with the Ktor server and OpenRouter API services |
| `androidx.core.content.FileProvider` | Securely exposes PDF resumes created by the app to external viewers and file handlers |

---

## 🗄️ Database & Data Model

### Backend Schema (Exposed ORM & H2)

```text
users
├── email (PK)             : Varchar(128)
├── name                   : Varchar(128)
├── role                   : Varchar(20)      # Student / Admin / Super Admin
├── password               : Varchar(128)     # BCrypt hashed
├── phoneNumber            : Varchar(20)
└── branch                 : Varchar(50)

admin_opportunities / student_opportunities
├── id (PK)                : Varchar(50)
├── title                  : Varchar(255)
├── company                : Varchar(255)
├── type                   : Varchar(50)      # Internship / Scholarship / Job
├── tags                   : Text (JSON)
├── location               : Varchar(255)
├── stipendOrSalary        : Varchar(100)
├── date                   : Varchar(100)
├── minCgpa                : Double
├── createdBy              : Varchar(128)
└── createdAt              : Varchar(50)

admin_applications / student_applications
├── id (PK)                : Varchar(50)
├── opportunityId          : Varchar(50)
├── opportunityTitle       : Varchar(255)
├── applicantName          : Varchar(255)
├── applicantEmail         : Varchar(128)
├── whyApply               : Text
├── status                 : Varchar(50)      # Pending / Shortlisted / Accepted / Rejected
├── resumeFileName         : Varchar(255)
├── familyIncome           : Varchar(50)
├── aadharCardFileName     : Varchar(255)
├── marksheetFileName      : Varchar(255)
└── appliedAt              : Varchar(50)

admin_approvals
├── id (PK)                : Varchar(50)
├── name / email / branch  : Varchar
├── password               : Varchar(128)
├── requestDate            : Varchar(50)
└── status                 : Varchar(20)      # Pending / Approved / Rejected
```

### Client Local Persistence (Room Database)

- **`UserEntity`:** Caches active session credentials and profile data.
- **`OpportunityEntity`:** Stores downloaded opportunities for offline browsing.
- **`ApplicationEntity`:** Maintains local records of submitted applications and submission statuses.

---

## 🧠 Engineering Highlights

- **Full-Stack Kotlin Development:** Shared language paradigms and model serialization across Android client and Ktor server.
- **Generative AI Integration:** Integration with OpenRouter API for multi-model LLM inference, structured prompt engineering, and fallback responses.
- **On-Device PDF Generation:** Programmatic canvas document drawing and vector rendering using native Android `PdfDocument` graphics.
- **Document Text Mining:** Server-side parsing of binary documents using Apache PDFBox and Apache POI to extract text for analysis.
- **Multi-Tiered Access Security:** Super Admin approval workflow ensuring verified administrator accounts before granting management access.
- **Graceful Security Upgrades:** Legacy password hash upgrade pipeline that transparently migrates stored hashes to modern BCrypt encryption upon successful authentication.

---

## 🔐 Security Considerations

- **Secret Isolation:** API keys and environment variables are managed via `.env` files and excluded from version control via `.gitignore`.
- **JWT Authorization:** Stateless token-based authentication with expiration controls to protect API endpoints.
- **Encrypted Password Storage:** BCrypt cryptographic hashing with individual salt generation.
- **Document Upload Sanitization:** Uploaded files are assigned random UUID prefixes to prevent filename collisions and directory traversal vulnerabilities.
- **Isolated Table Structures:** Clean separation between administrative and student databases to prevent unintended data exposure.

---

## 🤝 Contributing

Contributions, feedback, and pull requests are welcome.

### Contribution Workflow

1. Fork the repository.
2. Create a dedicated feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes with clear messages:
   ```bash
   git commit -m "feat: implement smart notification filters"
   ```
4. Push your branch to GitHub:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a Pull Request detailing the changes and relevant screenshots or testing notes.

---

## 📄 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for more information.

---

## 👨‍💻 Author

<div align="center">

### Abhinay Jangala

Android Developer | Full-Stack Kotlin Developer

Building modern Android applications focused on clean architecture, AI integration, and real-world problem solving.

[![GitHub](https://img.shields.io/badge/GitHub-AbhinayJangala-181717?style=for-the-badge&logo=github)](https://github.com/AbhinayJangala)

</div>

---

<div align="center">

**Built with Kotlin, Jetpack Compose, and Ktor.**

If you find SKILL2career helpful, consider giving the repository a ⭐.

</div>
