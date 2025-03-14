# RecyclerView Benefits and Implementation

## 📌 Benefits of RecyclerView
RecyclerView is an advanced and flexible version of ListView that improves UI performance and memory efficiency. Key features include:

- **Recycling Items**: Reuses item views, reducing memory usage.
- **Item Click Listener**: Handles item click events efficiently.
- **Layout Manager**: Supports multiple layouts (Linear, Grid, Staggered Grid).
- **Item Animator**: Adds animations when items are added, removed, or changed.
- **Item Decoration**: Customizable item spacing, dividers, and backgrounds.
- **CardView**: Provides an enhanced UI with material design card-based views.

## 🚀 Main Focus of This App
This app primarily emphasizes:
1. **Recycling Items**: Optimized memory usage through efficient view recycling.
2. **Item Click Listener**: Handling item click events in RecyclerView.

---

## 🔄 Difference Between ListView and RecyclerView
| Feature          | ListView | RecyclerView |
|----------------|---------|-------------|
| View Recycling | No      | Yes         |
| ViewHolder     | No      | Yes         |
| LayoutManager  | No      | Yes (Customizable) |
| Performance    | Slower  | Faster      |
| Custom Adapter | Optional | Mandatory  |

---

## 🎛️ Key Parameters Used
RecyclerView works with the following three parameters:
1. **Context** – The activity or fragment where RecyclerView is used.
2. **Layout** – Defines the UI structure of individual items.
3. **Data Source** – Supplies the data to be displayed in RecyclerView.

### LayoutManager Types:
- **LinearLayoutManager**: Displays items in a vertical or horizontal list.
  
<a href="https://github.com/user-attachments/assets/b869991a-e370-47ec-938b-41a3eb128247" alt="Watch the video"> </a>

<a href="https://github.com/user-attachments/assets/8ec20e8c-0bd8-4ade-9a47-5bd0e56c564f" alt="Watch the video"> </a>

<a href="https://github.com/user-attachments/assets/0c64483c-9380-4bbe-879d-adaefc2bf3fb" alt="Watch the video"> </a>
  
- **GridLayoutManager**: Displays items in a grid format.
  
  <img src="https://github.com/user-attachments/assets/8693b121-c709-4c3e-a1a0-987995cd4a5c" width="200" height="400">
  
- **StaggeredGridLayoutManager**: Displays items in a staggered grid layout.

<a href="https://github.com/user-attachments/assets/a748da2c-5746-4760-9baf-14c58547399d" alt="Watch the video"> </a>

---

## 📌 Model Class
### In ListView:
- A **String** was passed in an **ArrayList**.

### In RecyclerView:
- A **Model Class** is passed in an **ArrayList**, allowing better structuring of data.

---

## 🛠 Adapter Class Implementation
### `onCreateViewHolder`
- Inflates the item layout.

### `onBindViewHolder`
- Uses **getter and setter** methods to bind images and text from the **Model Class** to the views.
- Dynamically increases the size of RecyclerView as images and text are added.

### Adapter Functionality
- Retrieves data from the data source and displays it in views.
- **ListView Adapter**: Built-in adapter.
- **RecyclerView Adapter**: Customized adapter.
- `findViewById` is performed inside the **ViewHolder class** for performance optimization.

---

## 🎯 `RecyclerItemClickListener`
`RecyclerItemClickListener` is a **custom touch listener** that handles:
- **Click events** on RecyclerView items.

<a href="https://github.com/user-attachments/assets/9296c9a0-92f3-4d28-88a0-e55e2c1e5c57" alt="Watch the video"> </a>
  
- **Long-click events** without modifying the adapter.

<a href="https://github.com/user-attachments/assets/f1d9dea7-6d2b-4235-a204-3bd31439cb66" alt="Watch the video"> </a>


This class simplifies handling click interactions without cluttering the adapter class with click listeners.

---

## 📜 Copyright
© 2025 [Shalini Roy]. All rights reserved. This project is licensed under the MIT License.
