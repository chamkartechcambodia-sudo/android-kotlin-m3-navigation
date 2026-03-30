# 🎯 Android Trivia — Navigation Component

> **STEP IT Academy · Android Kotlin Course (XML UI)**
> Module 3 · Days 11–12 · Instructor: Magn

---

## 📱 App Overview

**Android Trivia** is a quiz app that demonstrates the Android **Navigation Component** — the modern, recommended way to handle screen-to-screen navigation in Android apps.

Students build this app across **D11 and D12**, progressing from basic NavGraph setup all the way to SafeArgs, Options Menu, Navigation Drawer, and Up Button support.

<br>

## ✨ Features

| Feature | Description |
|---|---|
| 🗺️ NavGraph | All screens declared and connected in a single XML file |
| 🧭 NavController | Type-safe navigation with `findNavController().navigate()` |
| 🔒 SafeArgs | Pass arguments between screens without string keys |
| 📋 Options Menu | Overflow menu with navigation to About screen |
| 🗂️ Navigation Drawer | Side drawer with Rules and About destinations |
| ⬆️ Up Button | Proper back navigation via `NavigationUI` |
| 🔙 Back Stack | Controlled with `popUpTo` and `inclusive` |

<br>

## 🛠️ Tech Stack

| Area | Technology                                                  |
|---|-------------------------------------------------------------|
| Language | Kotlin                                                      |
| UI Framework | XML Layouts + View Binding                                  |
| Navigation | Navigation Component · NavGraph · NavController · SafeArgs  |
| UI Components | Fragment · DrawerLayout · NavigationView · ConstraintLayout |
| Build System | Gradle (Kotlin DSL)                                         |
| Min SDK | API 30 (Android 11.0)                                       |
| Target SDK | API 36                                                      |

<br>

## 🌿 Branch Structure

This repo uses **11 exercise branches** — each branch is independent, forked from `main`, and contains specific `TODO` comments for students to complete.

| Branch | Exercise | Topic | Session |
|---|---|---|---|
| `main` | ✅ | Complete solution | — |
| `navigation_ex01` | Ex 01 | NavHostFragment setup in `activity_main.xml` | D11 |
| `navigation_ex02` | Ex 02 | NavGraph — add all Fragment destinations | D11 |
| `navigation_ex03` | Ex 03 | NavGraph — create all actions between screens | D11 |
| `navigation_ex04` | Ex 04 | `NavController.navigate()` in each Fragment | D11 |
| `navigation_ex05` | Ex 05 | SafeArgs plugin setup + declare arguments | D12 |
| `navigation_ex06` | Ex 06 | Pass & receive SafeArgs between screens | D12 |
| `navigation_ex07` | Ex 07 | Back stack manipulation (`popUpTo` + `inclusive`) | D12 |
| `navigation_ex08` | Ex 08 | Options Menu → About screen | D12 |
| `navigation_ex09` | Ex 09 | Navigation Drawer (`DrawerLayout` + `NavigationView`) | D12 |
| `navigation_ex10` | Ex 10 | Up Button + `NavigationUI` full wiring | D12 |
| `navigation_ex11` | 🏠 HW | Complete full Trivia game logic | Homework |

<br>

## 🗺️ Screen Flow

```
TitleFragment
     │
     │ [Play] ──────────────────────────────────────────▶ GameFragment
     │                                                         │
     │                                           ┌────────────┴────────────┐
     │                                           ▼                         ▼
     │                                   GameWonFragment           GameOverFragment
     │                                           │                         │
     │                                   [Play Again]               [Try Again]
     │                                           │                         │
     └───────────────────────────────────────────┴─────────────────────────┘
     
     [About] ──────────────────────────────────────────▶ AboutFragment
     (Options Menu / Navigation Drawer)
     
     [Rules] ──────────────────────────────────────────▶ RulesFragment
     (Navigation Drawer)
```

<br>

## 🚀 How to Run

### Prerequisites

- Android Studio Hedgehog (2023.1.1) or newer
- JDK 21
- Android Emulator or physical device (API 30+)

### Steps

```bash
# 1. Clone the repo
git clone https://github.com/chamkartech/android-kotlin-m1-navigation.git

# 2. Open in Android Studio
# File → Open → select the cloned folder

# 3. Sync Gradle
# Android Studio will prompt automatically

# 4. Run the app
# Click ▶ Run or press Shift + F10
```

<br>

## 📝 Student Workflow

```bash
# 1. Clone the repo
git clone https://github.com/chamkartechcambodia-sudo/android-kotlin-m3-navigation.git
cd android-kotlin-m1-navigation

# 2. Checkout your exercise branch (example: ex01)
git checkout navigation_ex01

# 3. Find all TODO comments and complete them
# Tip: Use Android Studio → Edit → Find → Find in Files → search "TODO"

# 4. Build and run the app to verify your solution

# 5. Commit your work
git add .
git commit -m "feat: complete navigation_ex01 - NavHostFragment setup"

# 6. Push to GitHub
git push origin navigation_ex01
```

<br>

## 📐 Project Structure

```
app/
├── src/main/
│   ├── java/com/example/android/navigation/
│   │   ├── MainActivity.kt               ← NavController + Drawer setup
│   │   ├── TitleFragment.kt              ← Start destination
│   │   ├── GameFragment.kt               ← Quiz logic
│   │   ├── GameWonFragment.kt            ← Receives SafeArgs score
│   │   ├── GameOverFragment.kt           ← Game over screen
│   │   ├── AboutFragment.kt              ← About screen
│   │   └── RulesFragment.kt              ← Rules screen
│   │
│   └── res/
│       ├── layout/
│       │   ├── activity_main.xml         ← NavHostFragment lives here
│       │   ├── fragment_title.xml
│       │   ├── fragment_game.xml
│       │   ├── fragment_game_won.xml
│       │   ├── fragment_game_over.xml
│       │   └── fragment_about.xml
│       │
│       ├── navigation/
│       │   └── nav_graph.xml             ← All destinations + actions
│       │
│       └── menu/
│           ├── winner_menu.xml           ← Options Menu
│           └── navdrawer_menu.xml        ← Navigation Drawer
│
└── build.gradle.kts                      ← SafeArgs plugin applied here
```

<br>

## 📸 Screenshots

> *(Add screenshots after completing the app — place images in `/docs/screenshots/`)*

| Title Screen | Game Screen | Game Won | Navigation Drawer |
|---|---|---|---|
| — | — | — | — |

<br>

## ✅ Commit Convention

All commits in this repo follow the **Conventional Commits** standard:

```
feat:     implement login screen
fix:      resolve crash in GameFragment
refactor: improve NavGraph structure
docs:     update README with screenshots
test:     add unit test for GameViewModel
```

<br>

## 📚 Learning Objectives

By completing all exercises in this module, students will be able to:

- ✅ Set up **NavHostFragment** as the container for all screens
- ✅ Create a **NavGraph XML** with multiple destinations and actions
- ✅ Navigate between screens using `findNavController().navigate()`
- ✅ Pass type-safe arguments using **SafeArgs**
- ✅ Manipulate the back stack with `popUpTo` and `inclusive`
- ✅ Add an **Options Menu** linked to NavGraph destinations
- ✅ Build a **Navigation Drawer** with `DrawerLayout` + `NavigationView`
- ✅ Wire the **Up Button** using `NavigationUI.setupActionBarWithNavController()`

<br>

## 🔗 References

- [Android Navigation Component Docs](https://developer.android.com/guide/navigation)
- [SafeArgs Plugin Guide](https://developer.android.com/guide/navigation/navigation-pass-data#Safe-args)
<br>

---

<div align="center">
  <sub>STEP IT Academy · Android Kotlin Course (XML UI) · Batch 1 · Instructor Magn · chamkartech</sub>
</div>