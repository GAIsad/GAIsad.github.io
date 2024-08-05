document.addEventListener('DOMContentLoaded', function() {
    const currentYear = new Date().getFullYear();
    const calendarDiv = document.getElementById('calendar');
    
    // 假设的日期和网址映射
    const urls = {
        '2024-07-29': 'https://gitee.com/clay_2_0/ice1/tree/master/src/day240729',
        
        // 更多日期和网址..
    };

    for (let month = 0; month < 12; month++) {
        const monthDiv = document.createElement('div');
        monthDiv.className = 'month';
        monthDiv.innerHTML = `
            <h3>${new Date(currentYear, month).toLocaleString('default', { month: 'long' })}</h3>
            <div class="days"></div>
        `;
        const daysDiv = monthDiv.querySelector('.days');

        const firstDay = new Date(currentYear, month, 1).getDay();
        const lastDay = new Date(currentYear, month + 1, 0).getDate();

        for (let i = 0; i < firstDay; i++) {
            const emptyDay = document.createElement('div');
            daysDiv.appendChild(emptyDay);
        }

        for (let day = 1; day <= lastDay; day++) {
            const dayDiv = document.createElement('div');
            dayDiv.className = 'day';
            dayDiv.textContent = day;
            daysDiv.appendChild(dayDiv);
            
            // 为每个日期添加点击事件
            dayDiv.addEventListener('click', function() {
                // 移除所有日期的selected类
                const days = document.querySelectorAll('.day');
                days.forEach(day => day.classList.remove('selected'));
                // 添加selected类到被点击的日期
                this.classList.add('selected');
                
                // 获取被点击日期的值
                const clickedDate = `${currentYear}-${(month + 1).toString().padStart(2, '0')}-${day.toString().padStart(2, '0')}`;
                
                // 检查是否存在对应的网址
                if (urls[clickedDate]) {
                    // 打开新的标签页跳转到指定网址
                    window.open(urls[clickedDate], '_blank');
                } else {
                    // 如果没有对应的网址，可以执行其他操作，例如显示警告等
                    alert('没有对应的代码日期');
                }
            });
        }

        calendarDiv.appendChild(monthDiv);
    }
});
